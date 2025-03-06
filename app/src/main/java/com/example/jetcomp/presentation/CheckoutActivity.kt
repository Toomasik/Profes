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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.hint
import com.example.jetcomp.ui.theme.text
import com.example.jetcomp.ui.theme.white

@Composable
fun Checkout(nav: NavController) {
    val openDialog = remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize().background(background).padding(20.dp)) {
        Box(
        modifier = Modifier.fillMaxWidth(),

    ) {
        IconButton(
            onClick = {
                nav.navigate("home")
            },
            modifier = Modifier
                .zIndex(2f).background(white, RoundedCornerShape(50.dp))
        ) {
            Icon(painter = painterResource(R.drawable.back), contentDescription = null, modifier = Modifier.padding(10.dp))
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
        Column(modifier = Modifier.fillMaxWidth().padding(top = 47.dp, bottom = 25.dp).background(white, RoundedCornerShape(14.dp)).padding(20.dp), verticalArrangement = Arrangement.Center) {
            Text("Контактная информация", fontSize = 14.sp)
            Row(modifier = Modifier.padding(vertical = 16.dp)) {
                Icon(painterResource(R.drawable.email), contentDescription = null, modifier = Modifier.background(
                    background, RoundedCornerShape(14.dp)
                ).padding(10.dp))
                Column(Modifier.weight(1f).padding(horizontal = 12.dp)) {
                    Text("emmanuel@gmail.com", fontSize = 14.sp, modifier = Modifier.padding(bottom = 4.dp))
                    Text("Email", color = hint, fontSize = 12.sp)
                }
                Icon(painter = painterResource(R.drawable.edit), contentDescription = null)
            }
            Row {
                Icon(painterResource(R.drawable.call), contentDescription = null, modifier = Modifier.background(
                    background, RoundedCornerShape(14.dp)
                ).padding(10.dp))
                Column(Modifier.weight(1f).padding(horizontal = 12.dp)) {
                    Text("+234-811-732-5298", fontSize = 14.sp, modifier = Modifier.padding(bottom = 4.dp))
                    Text("Телефон", color = hint, fontSize = 12.sp)
                }
                Icon(painter = painterResource(R.drawable.edit), contentDescription = null)
            }
            Text("Адрес", fontSize = 14.sp, modifier = Modifier.padding(vertical = 12.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("1082 Аэропорт, Нигерии", fontSize = 12.sp, color = hint, modifier = Modifier.weight(1f))
                Icon(painterResource(R.drawable.edit), null)
            }
            Image(painter = painterResource(R.drawable.map), null, modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 12.dp), contentScale = ContentScale.FillWidth)
            Text("Способ оплаты", fontSize = 14.sp, modifier = Modifier.padding(bottom = 12.dp))
            Row {
                Image(painter = painterResource(R.drawable.card_dbl), null, modifier = Modifier.background(
                    background, RoundedCornerShape(14.dp)
                ).padding(10.dp).size(32.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text("DbL Card", fontSize = 14.sp, modifier = Modifier.padding(bottom = 4.dp))
                    Text("**** **** 0696 4629", fontSize = 12.sp, color = hint)
                }
                Icon(painter = painterResource(R.drawable.arrow_down), null)
            }

        }
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
                .padding(top = 10.dp, bottom = 10.dp)
        ) {
            Text("Доставка", color = Color(0xff707B81), fontSize = 16.sp)
            Text("₽60.20", fontSize = 16.sp)
        }
        Image(painter = painterResource(R.drawable.punctir_line), contentDescription = null, modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 23.dp)
        ) {
            Text("Итого", color = text, fontSize = 16.sp)
            Text("₽814.15", fontSize = 16.sp, color = accent)
        }
        Button(
            onClick = {
                openDialog.value = !openDialog.value
            },
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth()

                .background(color = accent, shape = RoundedCornerShape(12.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Text(text = "Оформить заказ", color = white, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        }


    }
    if (openDialog.value){
        CustomAlertDialog({openDialog.value = false})
    }

}

@Composable
fun CustomAlertDialog(onDismiss: () -> Unit, ) {

    Dialog(onDismissRequest = { onDismiss() }, properties = DialogProperties(dismissOnClickOutside = true)) {
        Column(modifier = Modifier.width(335.dp).background(white, RoundedCornerShape(14.dp)).padding(40.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text("🎉", fontSize = 70.sp, modifier = Modifier.background(accent, RoundedCornerShape(50)).padding(24.dp))
            Text("Вы успешно оформили заказ", fontSize = 20.sp, modifier = Modifier.width(150.dp).padding(top = 24.dp, bottom = 30.dp), textAlign = TextAlign.Center)
            Button(
                onClick = {
                    onDismiss()
                },
                modifier = Modifier
                    .padding(top = 32.dp)
                    .fillMaxWidth()

                    .background(color = accent, shape = RoundedCornerShape(12.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "Вернуться к покупкам", color = white, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }

        }
    }
}