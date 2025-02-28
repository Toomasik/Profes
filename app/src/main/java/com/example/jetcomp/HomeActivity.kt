package com.example.jetcomp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Preview
@Composable
fun Home() {
    val context = LocalContext.current
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {
                    context.startActivity(Intent(context, MenuActivity::class.java))
                }) {
                    Image(
                        painter = painterResource(R.drawable.clock), contentDescription = "Menu"
                    )
                }
                Row(
                    modifier = Modifier
                        .offset(x = (-6).dp)
                        .weight(1F),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        modifier = Modifier.offset(x = 6.dp, y = -5.dp),
                        painter = painterResource(R.drawable.highlight),
                        contentDescription = null
                    )
                    Text(
                        fontSize = 32.sp, fontWeight = FontWeight.Bold, text = "Главная"

                    )
                }
                IconButton(
                    onClick = {
                        val intent = Intent(context, CartActivity::class.java)
                        context.startActivity(intent)
                    }, modifier = Modifier
                        .size(44.dp)
                        .background(
                            Color(0xFFFFFFFF), shape = RoundedCornerShape(50)
                        )

                ) {
                    Icon(
                        painter = painterResource(R.drawable.bag),
                        contentDescription = null,
                        tint = Color(0xFF2B2B2B)
                    )
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(top = 21.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                val textFieldValue = remember { mutableStateOf("") }
                TextField(
                    modifier = Modifier
                        .background(
                            Color(0xFFFFFFFF), shape = RoundedCornerShape(14.dp)
                        )
                        .shadow(
                            2.dp,
                            shape = RoundedCornerShape(16.dp),
                            ambientColor = Color.Transparent,
                            spotColor = Color(0x00000019)
                        ),
                    value = textFieldValue.value,
                    onValueChange = { newText: String -> textFieldValue.value = newText },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null
                        )
                    },
                    placeholder = { Text("Поиск") },

                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(14.dp)
                )



                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .padding(start = 14.dp)
                        .size(52.dp)
                        .background(
                            Color(0xFF48B2E7), shape = RoundedCornerShape(50)
                        )
                        .shadow(
                            2.dp,
                            shape = RoundedCornerShape(16.dp),
                            ambientColor = Color.Transparent,
                            spotColor = Color(0x00000019)
                        )
                        .padding(14.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.sliders),
                        contentDescription = null,
                        tint = Color(0xFFFFFFFF)
                    )
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 22.dp)
            ) {
                Text("Категории", fontSize = 16.sp)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 19.dp)
                ) {
                    Button(

                        onClick = {},
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .size(width = 108.dp, height = 40.dp)
                            .shadow(
                                2.dp,
                                shape = RoundedCornerShape(16.dp),
                                ambientColor = Color.Transparent,
                                spotColor = Color(0x00000019)
                            ),

                        ) { Text("Все", color = Color(0xff2B2B2B)) }

                    Button(

                        onClick = {},
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .size(width = 108.dp, height = 40.dp)
                            .shadow(
                                2.dp,
                                shape = RoundedCornerShape(16.dp),
                                ambientColor = Color.Transparent,
                                spotColor = Color(0x00000019)
                            ),

                        ) { Text("Outdoor", color = Color(0xff2B2B2B)) }

                    Button(

                        onClick = {},
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .size(width = 108.dp, height = 40.dp)
                            .shadow(
                                2.dp,
                                shape = RoundedCornerShape(16.dp),
                                ambientColor = Color.Transparent,
                                spotColor = Color(0x00000019)
                            ),

                        ) { Text("Tennis", color = Color(0xff2B2B2B)) }
                }
            }

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, bottom = 30.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Популярное", fontSize = 16.sp, modifier = Modifier.weight(1F))
                    Text(
                        "Все",
                        modifier = Modifier.align(Alignment.Bottom),

                        fontSize = 12.sp,
                        color = Color(0xff48B2E7)
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    BootView("BEST SELLER", "Nike Air Max", "₽752.00")
                    Spacer(Modifier.weight(1f))
                    BootView("BEST SELLER", "Nike Air Max", "₽752.00")
                }
            }

            Column(modifier = Modifier.padding(top = 30.dp)) {
                Row {
                    Text("Акции", fontSize = 16.sp, modifier = Modifier.weight(1F))
                    Text(
                        "Все",
                        modifier = Modifier.align(Alignment.Bottom),

                        fontSize = 12.sp,
                        color = Color(0xff48B2E7)
                    )
                }

                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                        .height(100.dp),
                    painter = painterResource(R.drawable.sale),
                    contentDescription = null
                )
            }


        }
        Row(
            modifier = Modifier
                .fillMaxWidth().height(190.dp)
                .paint(painter = painterResource(R.drawable.footer)),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.home), contentDescription = "Menu",
                    tint = Color(0xFF48B2E7)
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
                    tint = Color(0xFF707B81)
                )
            }
        }

    }


}


@Composable
fun BootView(seller: String, name: String, price: String) {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.BottomEnd) {
        IconButton(
            onClick = {},
            modifier = Modifier
                .size(36.dp)
                .background(
                    Color(0xFF48B2E7), shape = RoundedCornerShape(16.dp, 0.dp, 16.dp, 0.dp)
                )
                .padding(8.dp)
                .zIndex(2F)


        ) {
            Icon(
                painter = painterResource(R.drawable.add),
                contentDescription = null,
                tint = Color.White
            )
        }

        Card(
            modifier = Modifier
                .shadow(
                    2.dp, shape = RoundedCornerShape(16.dp), ambientColor = Color.Transparent,
                    spotColor = Color(0x00000019)
                )
                .background(Color.White, shape = RoundedCornerShape(16.dp))
                .padding(9.dp), colors = CardDefaults.cardColors(Color(0xffffffff))

        ) {


            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(36.dp)
                    .background(
                        Color(0xFFF7F7F9), shape = RoundedCornerShape(50)
                    )
                    .padding(8.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.favorite),
                    contentDescription = null,
                )
            }
            Image(
                modifier = Modifier
                    .size(width = 142.dp, height = 70.dp)
                    .offset(0.dp, -22.dp).clickable {
                    context.startActivity(Intent(context, CardActivity::class.java))






                    },
                painter = painterResource(R.drawable.boot),
                contentDescription = null
            )
            Text(seller, fontSize = 12.sp, color = Color(0xff48B2E7))
            Text(
                name,
                fontSize = 16.sp,
                color = Color(0xff6A6A6A),
                modifier = Modifier.padding(top = 8.dp, bottom = 14.dp)
            )
            Row(horizontalArrangement = Arrangement.SpaceAround) {
                Text(price, fontSize = 14.sp, color = Color(0xff2B2B2B))

            }

        }
    }


}