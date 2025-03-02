package com.example.jetcomp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcomp.ui.theme.JetCompTheme
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.disable
import com.example.jetcomp.ui.theme.red
import com.example.jetcomp.ui.theme.white

class FavActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Favorite()
        }
    }
}

@Preview
@Composable
fun Favorite(){
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize().background(background).padding(20.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                context.startActivity(Intent(context, HomeActivity::class.java))
            }, modifier = Modifier.background(white, RoundedCornerShape(50))) {
                Icon(
                    painter = painterResource(R.drawable.back), contentDescription = "Menu"
                )
            }

            Text("Избранное", fontSize = 16.sp)

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
                    painter = painterResource(R.drawable.favorite_fill),
                    contentDescription = null,
                    tint = red
                )
            }
        }
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(vertical = 20.dp).height(700.dp))  {
            items(8){ BootView("Best Seller", "Nike Air Max", "₽752.00") }
        }

    }
    Box(contentAlignment = Alignment.BottomStart, modifier = Modifier.fillMaxSize()){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paint(painter = painterResource(R.drawable.footer)),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {context.startActivity(Intent(context, HomeActivity::class.java))}) {
                Icon(
                    painter = painterResource(R.drawable.home), contentDescription = "Menu",
                    tint = disable
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.favorite), contentDescription = "Menu",
                    tint = accent
                )
            }
            IconButton(
                onClick = {context.startActivity(Intent(context, CartActivity::class.java))}, modifier = Modifier
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
            IconButton(onClick = {context.startActivity(Intent(context, NotificationsActivity::class.java)) }) {
                Icon(
                    painter = painterResource(R.drawable.notification), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
            IconButton(onClick = { context.startActivity(Intent(context, ProfileActivity::class.java))}) {
                Icon(
                    painter = painterResource(R.drawable.profile), contentDescription = "Menu",
                    tint = Color(0xFF707B81)
                )
            }
        }
    }


}