package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import `in`.ashutoshkk.weatherapp.R
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.Color1
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.TextColor1
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.WeatherAppTheme

@Composable
fun Radio(text: String) {
    val isSelected by rememberSaveable { mutableStateOf(false) }

    if (isSelected) {
        Text(
            text = text,
            color = TextColor1,
            modifier = Modifier
                .background(Color1)
                .padding(8.dp)
        )
    }
    else{
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier
                .background(Color.White)
                .padding(8.dp)
        )
    }
}