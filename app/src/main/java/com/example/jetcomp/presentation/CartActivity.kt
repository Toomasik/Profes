package com.example.jetcomp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.red
import com.example.jetcomp.ui.theme.text
import com.example.jetcomp.ui.theme.white
import com.kevinnzou.compose.swipebox.SwipeBox
import com.kevinnzou.compose.swipebox.SwipeDirection
import com.kevinnzou.compose.swipebox.widget.SwipeIcon
import kotlinx.coroutines.launch


@Composable
fun Cart(nav: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F9))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),

                ) {
                IconButton(
                    onClick = {
                        nav.navigate("home")
                    },
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(50))
                        .padding(5.dp)
                        .zIndex(2f)
                ) {
                    Icon(painter = painterResource(R.drawable.back), contentDescription = null)
                }
                Text(
                    text = "Корзина",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 16.dp)
                )
            }
            Text("3 Товара", fontSize = 16.sp, modifier = Modifier.padding(vertical = 10.dp))
            SwipeBoxAtBoth("Nike Club Max", "₽584.95")
            SwipeBoxAtBoth("Nike Air Max 200", "₽94.05")
            SwipeBoxAtBoth("Nike Air Max 270 Essential", "₽74.95")
        }
        Column(
            modifier = Modifier
                .padding(top = 75.dp)
                .fillMaxSize()
                .background(Color.White)
                .padding(20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp)
            ) {
                Text("Сумма", color = Color(0xff707B81), fontSize = 16.sp)
                Text("₽753.95", fontSize = 16.sp)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text("Доставка", color = Color(0xff707B81), fontSize = 16.sp)
                Text("₽60.20", fontSize = 16.sp)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 33.dp)
            ) {
                Text("Итого", color = text, fontSize = 16.sp)
                Text("₽814.15", fontSize = 16.sp, color = accent)
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 32.dp)
                    .fillMaxWidth()

                    .background(color = accent, shape = RoundedCornerShape(12.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "Оформить заказ", color = white, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }

        }
    }

}


@Composable
fun BootView(name: String, price: String) {



    Card(
        modifier = Modifier.padding(vertical = 7.5.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(Color(0xffF7F7F9), shape = RoundedCornerShape(16.dp))
                    .padding(14.dp)
                    .size(65.dp)

            )
            Column(
                modifier = Modifier
                    .padding(start = 30.dp), verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    name,
                    fontWeight = FontWeight.W600,
                    modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
                )
                Text(price)
            }
        }


    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SwipeBoxAtBoth(name: String, price: String,) {
    val coroutineScope = rememberCoroutineScope()
    SwipeBox(
        modifier = Modifier.fillMaxWidth(),
        swipeDirection = SwipeDirection.Both,
        startContentWidth = 60.dp,
        startContent = { swipeableState, _ ->
            SwipeIcon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Favorite",
                tint = Color.White,
                background = accent,
                weight = 1f,
                iconSize = 20.dp
            ) {
                coroutineScope.launch {
                    swipeableState.animateTo(0)
                }
            }
        },
        endContentWidth = 60.dp,
        endContent = { swipeableState, _ ->
            SwipeIcon(
                imageVector = Icons.Outlined.Delete,
                contentDescription = "Delete",
                tint = Color.White,
                background = red,
                weight = 0.8f,
                iconSize = 20.dp
            ) {
                coroutineScope.launch {
                    swipeableState.animateTo(0)
                }
            }
        }
    ) { _, _, _ ->
        BootView(name, price)
    }
}