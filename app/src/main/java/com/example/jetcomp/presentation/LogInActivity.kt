package com.example.jetcomp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.hint
import com.example.jetcomp.ui.theme.white

@Composable
fun LogIn(nav: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(white)
        .padding(20.dp)) {
        val email = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        IconButton(
            onClick = {nav.navigate("home")},
            modifier = Modifier
                .background(background, RoundedCornerShape(50))
                .size(44.dp)
        ) {
            Icon(painter = painterResource(R.drawable.back), contentDescription = null)
        }
        Text(
            "Привет!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 9.dp)
        )
        Text(
            "Заполните Свои данные или продолжите через социальные медиа",
            color = hint,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 35.dp)
        )
        Text("Email", fontSize = 16.sp)
        TextField(
            value = email.value,
            onValueChange = { newText -> email.value = newText },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, top = 12.dp)
                .background(
                    background, RoundedCornerShape(14.dp)
                ),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            )
        )
        Text("Пароль", fontSize = 16.sp)
        TextField(value = password.value,
            onValueChange = { password.value = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
                .background(
                    background, RoundedCornerShape(14.dp)
                ),
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.eye_close),
                    contentDescription = null
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))
        Text(
            "Востановить",
            color = hint,
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 210.dp)
                .background(accent, RoundedCornerShape(14.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                "Войти",
                color = white,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxSize().padding(bottom = 30.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
            Text("Вы впервые?", fontSize = 16.sp)
            Text(" Создать пользователя", fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.clickable {
                nav.navigate("signUp")
            })
        }
    }

}