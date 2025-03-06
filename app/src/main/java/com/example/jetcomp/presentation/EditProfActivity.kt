package com.example.jetcomp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetcomp.R
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.disable
import com.example.jetcomp.ui.theme.text
import com.example.jetcomp.ui.theme.white

@Composable
fun EditProf(nav: NavController) {
    val context = LocalContext.current
    val name = remember { mutableStateOf("") }
    val lastname = remember { mutableStateOf("") }
    val adress = remember { mutableStateOf("") }
    val telephone = remember { mutableStateOf("") }
    Box(contentAlignment = Alignment.BottomCenter) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(white)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    nav.navigate("profile")
                },
                modifier = Modifier
                    .background(accent, RoundedCornerShape(50))
                    .padding(horizontal = 70.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {
                Text("Сохранить", fontSize = 14.sp)
            }
            Image(
                painter = painterResource(R.drawable.man),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 48.dp)
                    .size(96.dp)
                    .clip(
                        RoundedCornerShape(50)
                    )
            )
            Text(
                "Эмануэль Кверти",
                color = text,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 11.dp)
            )
            Text("Изменить фото профиля", color = accent, fontSize = 12.sp, modifier = Modifier.padding(bottom = 21.dp))
            Image(
                painter = painterResource(R.drawable.shtrix_code),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(bottom = 19.dp)
            )
            Column {
                Text("Имя", fontSize = 16.sp)
                TextField(
                    value = name.value, onValueChange = { newText: String -> name.value = newText },
                    placeholder = { Text("Emmanuel", fontSize = 14.sp) },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.confrim),
                            contentDescription = null
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 17.dp)
                        .background(
                            background, RoundedCornerShape(14.dp)
                        )
                )

                Text("Фамилия", fontSize = 16.sp)
                TextField(
                    value = lastname.value,
                    onValueChange = { newText: String -> lastname.value = newText },
                    placeholder = { Text("Oyiboke", fontSize = 14.sp) },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.confrim),
                            contentDescription = null
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 17.dp)
                        .background(
                            background, RoundedCornerShape(14.dp),

                            )
                )

                Text("Адрес", fontSize = 16.sp)
                TextField(
                    value = adress.value,
                    onValueChange = { newText: String -> adress.value = newText },
                    placeholder = { Text("Nigeria", fontSize = 14.sp) },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.confrim),
                            contentDescription = null
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 17.dp)
                        .background(
                            background, RoundedCornerShape(14.dp)
                        )
                )

                Text("Телефон", fontSize = 16.sp)
                TextField(
                    value = telephone.value,
                    onValueChange = { newText: String -> telephone.value = newText },
                    placeholder = { Text("+7 811-732-5298", fontSize = 14.sp) },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.confrim),
                            contentDescription = null
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 17.dp)
                        .background(
                            background, RoundedCornerShape(14.dp)
                        )
                )
            }


        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(156.dp)
                .paint(painter = painterResource(R.drawable.footer)),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(onClick = {
                nav.navigate("home")
            }) {
                Icon(
                    painter = painterResource(R.drawable.home), contentDescription = "Menu",
                    tint = disable
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.favorite), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
            IconButton(
                onClick = { }, modifier = Modifier
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
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.notification), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.profile), contentDescription = "Menu",
                    tint = accent
                )
            }
        }

    }
}