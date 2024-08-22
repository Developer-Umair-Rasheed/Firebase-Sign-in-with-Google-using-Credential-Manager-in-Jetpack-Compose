package com.umairrasheed.firebaegooglesignin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.umairrasheed.firebaegooglesignin.R
import com.umairrasheed.firebaegooglesignin.ui.theme.AppColor

@Composable
fun HomeScreen(onGoogleSignInClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = {
                onGoogleSignInClick()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .align(Alignment.Center)
                .padding(5.dp),
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(0.dp),
        ) {
            Row(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                AppColor.purple,
                                AppColor.pink
                            ),
                        )
                    )
                    .fillMaxSize()
                    .padding(10.dp),
                // contentAlignment = Alignment.Center
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google"
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "Continue with Google"
                )
            }
        }
    }
}