package com.example.jetcomp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.hint
import com.example.jetcomp.ui.theme.white

@Composable
fun Notifications(nav: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(white)
        .padding(20.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            IconButton(
                onClick = {
                    nav.navigate("menu")
                },
                modifier = Modifier
                    .zIndex(2f)
            ) {
                Icon(painter = painterResource(R.drawable.clock), contentDescription = null)
            }
            Text(
                text = "Уведомления",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 16.dp)
            )
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(6) {
                Notification(
                    "Заголовок",
                    "Lorem ipsum dolor sit amet consectetur. Venenatis pulvinar lobortis risus consectetur morbi egestas id in bibendum. Volutpat nulla urna sit sed diam nulla.",
                    "27.01.2024, 15:42"
                )
            }
            item { Spacer(modifier = Modifier.height(100.dp)) }
        }


    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paint(painter = painterResource(R.drawable.footer), contentScale = ContentScale.FillWidth),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.home), contentDescription = "Menu",
                    tint = Color(0xFF48B2E7)
                )
            }
            IconButton(onClick = {
                nav.navigate("fav")
            }) {
                Icon(
                    painter = painterResource(R.drawable.favorite), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
            IconButton(
                onClick = { nav.navigate("cart") },
                modifier = Modifier
                    .offset(y = -30.dp)
                    .background(
                        color = Color(0xFF48B2E7),
                        shape = RoundedCornerShape(50)
                    )
                    .size(56.dp)
                    .padding(16.dp)

            ) {
                Icon(
                    painter = painterResource(R.drawable.bag),
                    contentDescription = "Menu",
                    tint = Color.White,

                    )
            }
            IconButton(onClick = {
                nav.navigate("notification")
            }) {
                Icon(
                    painter = painterResource(R.drawable.notification), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
            IconButton(onClick = {
                nav.navigate("profile")
            }) {
                Icon(
                    painter = painterResource(R.drawable.profile), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
        }
    }

}

@Composable
fun Notification(title: String, subTitle: String, date: String) {
    Column(modifier = Modifier
        .background(background, RoundedCornerShape(14.dp))
        .padding(16.dp)) {
        Text(title, fontSize = 16.sp)
        Text(subTitle, fontSize = 12.sp, modifier = Modifier.padding(top = 8.dp, bottom = 16.dp))
        Text(date, fontSize = 12.sp, color = hint, fontStyle = FontStyle.Italic)
    }

}
