package com.example.jetcomp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcomp.ui.theme.disable
import com.example.jetcomp.ui.theme.text
import com.example.jetcomp.ui.theme.white
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnBoarding()
        }
    }
}


@Composable
fun OnBoarding() {
    val gradient =
        Brush.verticalGradient(listOf(Color(0xff48B2E7), Color(0xff44A9DC), Color(0xff2B6B8B)))
    val pagerState = rememberPagerState { 3 }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient)
    ) {
        HorizontalPager(
            state = pagerState, modifier = Modifier

        ) {
            if (pagerState.currentPage == 0) {
                OnBoardingScreenOne(pagerState)
            } else {
                val title =
                    if (pagerState.currentPage == 1) "Начнем путешествие" else "У вас есть сила, чтобы"
                val subTitle =
                    if (pagerState.currentPage == 1) "Умная, великолепная и модная коллекция Изучите сейчас" else "В вашей комнате много красивых и привлекательных растений"
                OnBoardingScreen(pagerState, title, subTitle)
            }
        }


    }
}

@Composable
fun OnBoardingScreenOne(pagerState: PagerState) {
    val coroutineScope = rememberCoroutineScope()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "ДОБРО ПОЖАЛОВАТЬ",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = white,
            modifier = Modifier
                .width(267.dp)
                .padding(top = 70.dp, bottom = 130.dp)

        )
        Image(
            painter = painterResource(R.drawable.boot_screen_one),
            contentDescription = null,
            modifier =
            Modifier
                .fillMaxWidth()
                .height(302.dp)
        )
        Indicator(
            pagerState,
            Modifier
                .fillMaxWidth()
                .padding(top = 26.dp)
        )
        Button(
            onClick = {
                coroutineScope.launch {
                    pagerState.scrollToPage(pagerState.currentPage + 1)
                }
            },
            Modifier
                .padding(end = 20.dp, start = 20.dp, top = 136.dp)
                .background(white, RoundedCornerShape(13.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                "Начать",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = text
            )
        }
    }
}

@Composable
fun OnBoardingScreen(pagerState: PagerState, title: String, subTitle: String) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 80.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.boot_two),
            contentDescription = null,
            modifier =
            Modifier
                .fillMaxWidth()
                .height(302.dp)
        )
        Text(
            title,
            fontSize = 34.sp,
            textAlign = TextAlign.Center,
            color = white,
            modifier = Modifier
                .width(267.dp)
                .padding(top = 60.dp, bottom = 12.dp)

        )
        Text(
            subTitle,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = white,
            modifier = Modifier
                .width(267.dp)
                .padding(bottom = 40.dp)

        )
        Indicator(
            pagerState,
            Modifier
                .fillMaxWidth()
                .padding(top = 26.dp)
        )
        Button(
            onClick = {
                if (pagerState.currentPage == 1)
                coroutineScope.launch {
                    pagerState.scrollToPage(pagerState.currentPage + 1)
                } else {
                    val intent = Intent(context, HomeActivity::class.java)
                    context.startActivity(intent)
                }
            },
            Modifier
                .padding(end = 20.dp, start = 20.dp, top = 95.dp)
                .background(white, RoundedCornerShape(13.dp)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            )
        ) {
            Text(
                "Далее",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = text
            )
        }
    }
}


@Composable
fun Indicator(pagerState: PagerState, modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(pagerState.pageCount) { iteration ->
            val color = if (pagerState.currentPage == iteration) white else disable
            val width = if (pagerState.currentPage == iteration) 42.dp else 28.dp
            Box(
                modifier = Modifier
                    .padding(2.dp)
                    .background(color, shape = RoundedCornerShape(50))
                    .size(width = width, height = 10.dp)
            )
        }
    }
}


