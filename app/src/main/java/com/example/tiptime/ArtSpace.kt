package com.example.tiptime

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ArtSpace(modifier: Modifier = Modifier) {
    val currentStep by remember { mutableIntStateOf(1) }
    val image = when (currentStep) {
        1 -> R.drawable.image1
        2 -> R.drawable.image2
        else -> R.drawable.image3
    }
    val title = when (currentStep) {
        1 -> R.string.image1_title
        2 -> R.string.image2_title
        else -> R.string.image3_title
    }
    val artist = when (currentStep) {
        1 -> R.string.image1_artist
        2 -> R.string.image2_artist
        else -> R.string.image3_artist
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    }
}