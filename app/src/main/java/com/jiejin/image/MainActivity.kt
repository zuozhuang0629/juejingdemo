package com.jiejin.image

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jiejin.image.ui.theme.ImageviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageUI()
                }
            }
        }
    }
}

@Composable
fun ImageUI() {
    Image(
        painterResource(R.drawable.ic_temp),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier =  Modifier
            .width(100.dp)
            .height(100.dp)
            .clip(shape = RoundedCornerShape(50))
            .border(
                width = 2.dp,
                color = Color.White,
                shape = RoundedCornerShape(50)
            )

    )

}

@Preview(name = "Newline greeting")
@Composable
fun DefaultPreview() {
    ImageviewTheme {
        ImageUI()
    }
}