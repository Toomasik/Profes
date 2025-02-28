package com.example.jetcomp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.white

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Menu()
        }
    }
}

@Preview
@Composable
fun Menu() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(accent)
            .padding(35.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.man),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 42.dp, bottom = 15.dp)
                .size(96.dp)
                .clip(
                    RoundedCornerShape(50)
                )
        )
        Text(
            "Эмануэль Кверти",
            color = white,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 42.dp)
        )
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                tint = white
            )
            Text(
                "Профиль",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp).clickable {
                    context.startActivity(Intent(context, ProfileActivity::class.java))
                }
            )
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(R.drawable.bag), contentDescription = null, tint = white)
            Text(
                "Корзина",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp).clickable {
                    context.startActivity(Intent(context, CartActivity::class.java))
                }
            )
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.favorite),
                contentDescription = null,
                tint = white
            )
            Text(
                "Избранное",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.orders),
                contentDescription = null,
                tint = white
            )
            Text(
                "Заказы",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.notification),
                contentDescription = null,
                tint = white
            )
            Text(
                "Уведомления",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.settings),
                contentDescription = null,
                tint = white
            )
            Text(
                "Настройки",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .height(2.dp)
                .width(300.dp)
                .background(Color(0x3bF7F7F9))
        )
        Row(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.logout),
                contentDescription = null,
                tint = white
            )
            Text(
                "Выйти",
                fontSize = 16.sp,
                color = white,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
    }
}