package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import `in`.ashutoshkk.weatherapp.presentation.weather.components.WeatherCard

@Composable
fun WeatherScreen(
    navController: NavController
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        WeatherCard()
    }
}

@Preview(showBackground = true)
@Composable
fun previewWeatherScreen() {
    WeatherScreen(navController = rememberNavController())
}