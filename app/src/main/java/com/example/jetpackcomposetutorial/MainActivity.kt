package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackComposeTutorial()
                }
            }
        }
    }
}
@Composable
fun JetpackComposeTutorial() {

    Column {
        Image(modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Header Image"
        )
        Text(modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.jetpack_compose_tutorial_header),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
        )
        Text(modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            text = stringResource(R.string.jetpack_compose_explaner),
            textAlign = TextAlign.Justify
        )
        Text(modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.jetpack_compose_body),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun JetpackComposeTutorialPreview(){
    JetpackComposeTutorial()
}
