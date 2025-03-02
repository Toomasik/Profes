package com.example.jetcomp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.jetcomp.ui.theme.JetCompTheme
import com.example.jetcomp.ui.theme.accent
import com.example.jetcomp.ui.theme.background
import com.example.jetcomp.ui.theme.white
import java.util.Locale.Category

class CategoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Category()
        }
    }
}
@Preview
@Composable
fun Category(){
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize().background(background).padding(20.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            IconButton(
                onClick = {
                    val intent = Intent(context, HomeActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50))

                    .zIndex(2f)
            ) {
                Icon(painter = painterResource(R.drawable.back), contentDescription = null)
            }
            Text(
                text = "OutDoor",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 16.dp)
            )
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

                    onClick = {context.startActivity(Intent(context, CategoryActivity::class.java))},
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

                    onClick = {context.startActivity(Intent(context, CategoryActivity::class.java))},
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(accent),
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(width = 108.dp, height = 40.dp)
                        .shadow(
                            2.dp,
                            shape = RoundedCornerShape(16.dp),
                            ambientColor = Color.Transparent,
                            spotColor = Color(0x00000019)
                        ),

                    ) { Text("Outdoor", color = white) }

                Button(

                    onClick = {context.startActivity(Intent(context, CategoryActivity::class.java))},
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
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(vertical = 20.dp))  {
            items(8){ BootView("Best Seller", "Nike Air Max", "₽752.00") }
        }

    }
}