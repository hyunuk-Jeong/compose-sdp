package com.hyunuk.compose_sdp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SdpInit(designWidth = 360, designHeight = 640) {
                TestUI()
            }
        }
    }
}

@Composable
fun TestUI() {
    Column {
        Text(text = "Test SDP Example")
        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
        val width = 200.sdp_w()
        val height = 100.sdp_h()
        Button(onClick = { /* Handle Click */ }) {
            Text("Click Me")
        }
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        Text("Width: $width, Height: $height")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestUI()
}