package com.olubankeeboda.aboutme

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.core.content.ContextCompat

@Composable
fun PersonalDetails(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxSize()
        ) {

            Image(
                painterResource(id = R.drawable.img),
                contentDescription = stringResource(R.string.content_description),
                modifier = Modifier
                    .padding(
                        top = dimensionResource(id = R.dimen.padding_medium),
                        bottom = dimensionResource(id = R.dimen.padding_small)
                    )
                    .size(dimensionResource(id = R.dimen.image_size))
                    .clip(
                        AbsoluteRoundedCornerShape(10)
                    )
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))

            Text(
                text = stringResource(id = R.string.slack_name),
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))

            val context = LocalContext.current

            Button(
                onClick = {
                    openGitHub(context, "https://github.com/Abbanks")
                },
                shape = RoundedCornerShape(dimensionResource(id = R.dimen.button_corner_radius)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = dimensionResource(id = R.dimen.button_elevation)),
                enabled = true
            ) {
                Text(
                    text = stringResource(id = R.string.button_text),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}

fun openGitHub(context: Context, url: String) {
    // Create an intent to open the web browser
    val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(url))
    // Create a launcher for the browser intent
    ContextCompat.startActivity(context, intent, null)
}