package com.example.movieinfo.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalUnitApi::class)
@Composable
fun DetailsScreen(navController: NavController, movieTitle: String?){
    Scaffold(topBar = {TopAppBar(backgroundColor = MaterialTheme.colors.background, elevation = 4.dp) {
        Row(horizontalArrangement = Arrangement.Start) {
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.ArrowBack, 
                contentDescription = "Back arrow", modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Details")
        } 
    }}) {
        Box(modifier = Modifier.fillMaxSize().padding(it),
            contentAlignment = Alignment.Center) {
            Text(text = movieTitle.toString(),
                fontFamily = FontFamily.SansSerif,
                fontSize = TextUnit(24f, type = TextUnitType.Sp),
            fontWeight = FontWeight.ExtraBold
            )
        }
    }
}