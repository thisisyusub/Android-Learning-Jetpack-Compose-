package com.example.businesscard

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold (
                    modifier = Modifier.fillMaxSize()
                        .fillMaxSize(),
                    containerColor = Color(0xFF3ddc84),
                    content = {
                            innerPadding ->
                        Column(
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxSize(),
                        ) {
                            Spacer(modifier = Modifier.size(0.dp))
                            PersonInfo(
                                fullName = "Kanan Yusubov",
                                title = "Mobile Platforms Expert",
                                modifier = Modifier
                                    .padding(innerPadding)
                            )
                            ContactInfo(
                                phoneNumber = "+994 50 8040 04 58",
                                email = "kanan.yusub@gmail.com",
                                modifier = Modifier
                                    .padding(16.dp),
                            )
                        }
                    }
                )
            }
        }
    }
}

@Composable
 fun ContactInfo(phoneNumber: String, email: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        ) {
           Row(Modifier.padding(bottom = 8.dp)) {
               Icon(
                   Icons.Rounded.Phone,
                   contentDescription = null,
                   modifier = Modifier.padding(end = 4.dp)
               )
               Text(
                   text = phoneNumber,
                   fontSize = 14.sp,
                   lineHeight = 16.sp,
               )
           }
          Row {
              Icon(
                  Icons.Rounded.Email,
                  contentDescription = null,
                  modifier = Modifier.padding(end = 4.dp),
              )
              Text(
                  text = email,
                  fontSize = 14.sp,
                  lineHeight = 16.sp,
              )
          }
    }
}


@Composable
fun PersonInfo(fullName: String, title: String, modifier: Modifier = Modifier) {
    val androidLogo = painterResource(id = R.drawable.android_logo)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = androidLogo,
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .background(color = Color.Black)
                .size(120.dp),
            )
        Text(
            text = fullName,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            )
        Text(
            text = title,
            fontSize = 14.sp,
            lineHeight = 16.sp,
            )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonInfo() {
    BusinessCardTheme {
        Scaffold (
            modifier = Modifier.fillMaxSize()
                .fillMaxSize(),
            containerColor = Color(0xFF3ddc84),
            content = {
                    innerPadding ->
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                ) {
                    Spacer(modifier = Modifier.size(0.dp))
                    PersonInfo(
                        fullName = "Kanan Yusubov",
                        title = "Mobile Platforms Expert",
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                    ContactInfo(
                        phoneNumber = "+994 50 8040 04 58",
                        email = "kanan.yusub@gmail.com",
                        modifier = Modifier
                            .padding(16.dp),
                    )
                }
            }
        )
    }
}
