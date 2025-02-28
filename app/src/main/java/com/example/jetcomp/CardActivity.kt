package com.example.jetcomp

import android.adservices.topics.Topic
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.core.provider.FontsContractCompat.Columns
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.darkbg
import com.example.jetcomp.ui.theme.hint
import com.example.jetcomp.ui.theme.text
import com.example.jetcomp.ui.theme.white


class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview
@Composable
fun Card() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(vertical = 20.dp, horizontal = 20.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(Color.Transparent)
            ) {
                Icon(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "Cart",
                    modifier = Modifier
                        .background(
                            white, RoundedCornerShape(50)
                        )
                        .padding(10.dp)
                        .size(24.dp)
                )
            }
            Text(
                "Sneaker shop",
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
            IconButton(
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(Color.Transparent)
            ) {
                Icon(
                    painter = painterResource(R.drawable.bag),
                    contentDescription = "Cart",
                    modifier = Modifier
                        .background(
                            white, RoundedCornerShape(50)
                        )
                        .padding(10.dp)
                        .size(24.dp)
                )
            }
        }
        Text(
            "Nike Air Max 270 Essential",
            fontSize = 26.sp,
            modifier = Modifier
                .padding(top = 26.dp)
                .width(200.dp),
            color = text
        )
        Text(
            "Men’s Shoes",
            color = hint,
            modifier = Modifier.padding(vertical = 14.dp),
            fontSize = 16.sp
        )
        Text("₽179.39", fontSize = 24.sp, color = text)
        Image(
            painter = painterResource(R.drawable.boot),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .padding(top = 25.dp)
        )
        Image(
            painter = painterResource(R.drawable.underline),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .absoluteOffset(y = -78.dp)
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(
                        white, RoundedCornerShape(16.dp)
                    )
                    .size(56.dp)
                    .padding(vertical = 14.dp)
            )
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(
                        white, RoundedCornerShape(16.dp)
                    )
                    .size(56.dp)
                    .padding(vertical = 14.dp)
            )
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(
                        white, RoundedCornerShape(16.dp)
                    )
                    .size(56.dp)
                    .padding(vertical = 14.dp)
            )
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(
                        white, RoundedCornerShape(16.dp)
                    )
                    .size(56.dp)
                    .padding(vertical = 14.dp)
            )
            Image(
                painter = painterResource(R.drawable.boot),
                contentDescription = null,
                modifier = Modifier
                    .background(
                        white, RoundedCornerShape(16.dp)
                    )
                    .size(56.dp)
                    .padding(vertical = 14.dp)
            )
        }
        Text(
            "Вставка Max Air 270 обеспечивает непревзойденный комфорт в течение всего дня. Изящный дизайн ................",
            color = hint,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 33.dp)
        )
        Text(
            "Подробнее",
            color = accent,
            textAlign = TextAlign.Right,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            fontSize = 14.sp
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 65.dp), verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(Color.Transparent),
                modifier = Modifier.padding(end = 18.dp).background(
                    darkbg, RoundedCornerShape(50)
                ).size(52.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.favorite),
                    contentDescription = "Cart",
                    modifier = Modifier.size(24.dp)
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                modifier = Modifier
                    .background(
                        accent, RoundedCornerShape(12.dp)
                    ),
                contentPadding = PaddingValues(15.dp)
            ) {
                    Icon(
                        painter = painterResource(R.drawable.bag),
                        contentDescription = null,
                        tint = white,
                    )
                    Text("В корзину", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), fontSize = 14.sp)

            }
        }
    }
}
