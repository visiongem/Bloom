package com.yn.bloom.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yn.bloom.R
import com.yn.bloom.ui.theme.*

/**
 * Description：WelcomePage
 * @author Created by pengyanni
 * @e-mail 393507488@qq.com
 * @time   2023/2/17 11:07
 */
@Preview
@Composable
fun WelcomePage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(pink100)
    ) {
        Image(
            painter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_light_welcome_bg)), contentDescription = "welcome_bg",
            modifier = Modifier.fillMaxSize()
        )
        WelcomeContent()
    }

}

@Composable
fun WelcomeContent() {

    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(72.dp))
        LeafImage()
        Spacer(modifier = Modifier.height(48.dp))
        WelcomeTitle()
        Spacer(modifier = Modifier.height(40.dp))
        WelcomeButtons()
    }
}

@Composable
fun LeafImage() {
    Image(
        painter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_light_welcome_illos)), contentDescription = "welcome_illos",
        modifier = Modifier
            .wrapContentSize()
            .padding(start = 88.dp)
    )
}

@Composable
fun WelcomeTitle() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_light_logo)), contentDescription = "welcome_logo",
            modifier = Modifier
                .wrapContentWidth()
                .height(32.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Beautiful home garden solutions",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.subtitle1,
                color = gray
            )
        }
    }
}

@Composable
fun WelcomeButtons() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(48.dp)
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .clip(Shapes.medium),
            colors = ButtonDefaults.buttonColors(backgroundColor = pink900)
        ) {
            Text(
                text = "Create account",
                style = MaterialTheme.typography.button,
                color = white
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.button,
                color = pink900
            )
        }
    }
}