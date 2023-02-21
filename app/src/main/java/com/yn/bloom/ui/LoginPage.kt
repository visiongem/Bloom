package com.yn.bloom.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yn.bloom.ui.theme.*

/**
 * Description：LoginPage
 * @author Created by pengyanni
 * @e-mail 393507488@qq.com
 * @time   2023/2/17 15:42
 */
@Preview
@Composable
fun LoginPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(white)
            .padding(horizontal = 16.dp)
    ) {
        LoginTitle()
        LoginInputBox()
        HintWithUnderLine()
        LoginButton()
    }
}

@Composable
fun LoginTitle() {
    Text(
        text = "Login with email",
        modifier = Modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 184.dp, bottom = 16.dp),
        style = MaterialTheme.typography.h1,
        color = gray,
        textAlign = TextAlign.Center
    )
}

@Composable
fun LoginInputBox() {
    Column {
        LoginTextFiled("Email address")
        Spacer(modifier = Modifier.height(8.dp))
        LoginTextFiled("Password(8+ Characters)")
    }
}

@Composable
fun LoginTextFiled(placeHolder: String) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(Shapes.small),
        placeholder = {
            Text(text = "$placeHolder", style = MaterialTheme.typography.body1, color = gray)
        }
    )
}

@Composable
fun HintWithUnderLine() {
    Column(modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 16.dp)) {
        TopText()
        BottomText()
    }
}

@Composable
fun TopText() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        var keywordPre = "By Clicking below you agree to our".split(" ")
        var keywordPost = "and consent".split(" ")
        for (word in keywordPre) {
            Text(text = word, style = MaterialTheme.typography.body2, color = gray)
        }
        Text(text = "Terms of Use", style = MaterialTheme.typography.body2, color = gray, textDecoration = TextDecoration.Underline)
        for (word in keywordPost) {
            Text(text = word, style = MaterialTheme.typography.body2, color = MaterialTheme.colors.onPrimary)
        }
    }
}

@Composable
fun BottomText() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "to Our ", style = MaterialTheme.typography.body2, color = gray)
        Text(text = "Privacy Policy.", style = MaterialTheme.typography.body2, color = gray, textDecoration = TextDecoration.Underline)
    }
}

@Composable
fun LoginButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .clip(Shapes.medium), colors = ButtonDefaults.buttonColors(backgroundColor = pink900)
    ) {
        Text(text = "Login", style = MaterialTheme.typography.button, color = white)
    }
}