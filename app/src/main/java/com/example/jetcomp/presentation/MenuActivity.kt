package com.example.jetcomp.presentation

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.white

@Composable
fun Menu(nav: NavController) {
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
                    nav.navigate("profile")
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
                    nav.navigate("cart")
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
                modifier = Modifier.padding(start = 25.dp).clickable {
                    nav.navigate("logIn")
                }
            )
        }
    }
}