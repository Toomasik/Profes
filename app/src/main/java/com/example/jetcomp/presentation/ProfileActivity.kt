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
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
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
import kotlinx.coroutines.launch


@Composable
fun Profile(nav: NavController){
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = { if (drawerState.isOpen) Menu(nav) else Column{} },
        scrimColor = accent,
        content={
            Box(contentAlignment = Alignment.BottomCenter){
                Column(
                    modifier = Modifier.fillMaxSize().background(white).padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(top = 30.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {



                        IconButton(onClick ={scope.launch {drawerState.open()}} ) {
                            Icon(
                                painter = painterResource(R.drawable.clock), contentDescription = "Menu"
                            )
                        }
                        Text(
                            fontSize = 16.sp, text = "Профиль", modifier = Modifier.weight(1f), textAlign = TextAlign.Center, fontFamily = FontFamily.Serif)
                        IconButton(
                            onClick = {
                                nav.navigate("editProfile")
                            }, modifier = Modifier
                                .background(
                                    accent, shape = RoundedCornerShape(50)
                                ).size(40.dp)

                        ) {
                            Icon(
                                painter = painterResource(R.drawable.edit),
                                contentDescription = null,
                                tint = white
                            )
                        }
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
                        modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 32.dp)
                    )
                    Image(painter = painterResource(R.drawable.shtrix_code), contentDescription = null, modifier = Modifier.fillMaxWidth().height(100.dp).padding(bottom = 19.dp))
                    Column {
                        Text("Имя", fontSize = 16.sp)
                        Text("Emmanuel", fontSize = 14.sp, modifier = Modifier.fillMaxWidth().padding(vertical = 17.dp).background(
                            background, RoundedCornerShape(14.dp)
                        ).padding(vertical = 17.dp, horizontal = 16.dp))
                        Text("Фамилия", fontSize = 16.sp)
                        Text("Oyiboke", fontSize = 14.sp, modifier = Modifier.fillMaxWidth().padding(vertical = 17.dp).background(
                            background, RoundedCornerShape(14.dp)
                        ).padding(vertical = 17.dp, horizontal = 16.dp))
                        Text("Адрес", fontSize = 16.sp)
                        Text("Nigeria", fontSize = 14.sp, modifier = Modifier.fillMaxWidth().padding(vertical = 17.dp).background(
                            background, RoundedCornerShape(14.dp)
                        ).padding(vertical = 17.dp, horizontal = 16.dp))
                        Text("Телефон", fontSize = 16.sp)
                        Text("+7 811-732-5298", fontSize = 14.sp, modifier = Modifier.fillMaxWidth().padding(vertical = 17.dp).background(
                            background, RoundedCornerShape(14.dp)
                        ).padding(vertical = 17.dp, horizontal = 16.dp))
                    }



                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth().height(156.dp)
                        .paint(painter = painterResource(R.drawable.footer),),
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
                    IconButton(onClick = { nav.navigate("fav")}) {
                        Icon(
                            painter = painterResource(R.drawable.favorite), contentDescription = "Menu",
                            tint = Color(0xFF707B81)
                        )
                    }
                    IconButton(
                        onClick = {nav.navigate("cart") }, modifier = Modifier
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
                    IconButton(onClick = {nav.navigate("notification") }) {
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
    )
}