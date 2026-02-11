package com.example.practice_simple_card_business

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice_simple_card_business.ui.theme.PracticeSimpleCardBusinessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeSimpleCardBusinessTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllLayout(bgColor = Color(0xFFfff4e6))
                }
            }
        }
    }
}

@Composable
private fun ProfileSection(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable._770633052664__1_)
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .clip(CircleShape)
                .size(200.dp)
                .border(1.dp, Color.DarkGray, CircleShape)
        )
        Text(
            text = stringResource(R.string.name),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp),
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color(0xFF4b3832)
        )
        Text(
            text = stringResource(R.string.desc),
            textAlign = TextAlign.Center,
            fontSize = 8.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            color = Color.DarkGray
        )
    }
}


@Composable
private fun InformationSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.github),
                contentDescription = null,
                modifier = Modifier.size(42.dp).padding(8.dp)
            )
            Text(
                text = stringResource(R.string.github),
                fontSize = 10.sp,
                modifier = Modifier.padding(end = 8.dp),
                color = Color(0xFF4b3832)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.instagram),
                contentDescription = null,
                modifier = Modifier.size(42.dp).padding(8.dp)
            )
            Text(
                text = stringResource(R.string.instagram),
                fontSize = 10.sp,
                modifier = Modifier.padding(end = 8.dp),
                color = Color(0xFF4b3832)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = null,
                modifier = Modifier.size(42.dp).padding(8.dp)
            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 10.sp,
                modifier = Modifier.padding(end = 8.dp),
                color = Color(0xFF4b3832)
            )
        }
    }
}

@Composable
fun AllLayout(bgColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(bgColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ProfileSection()
        Spacer(modifier = Modifier.weight(1f))
        InformationSection()
        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    PracticeSimpleCardBusinessTheme {
        ProfileSection()
    }
}

@Preview(showBackground = true)
@Composable
fun InformationPreview() {
    PracticeSimpleCardBusinessTheme {
        InformationSection()
    }
}

@Preview(showBackground = true)
@Composable
fun AllPreview() {
    PracticeSimpleCardBusinessTheme {
        AllLayout(bgColor = Color(0xFFfff4e6))
    }
}
