package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun WeatherScreen(
    navController: NavController
) {
    Row(modifier = Modifier.fillMaxWidth()) {

    }
}

@Preview(showBackground = true)
@Composable
fun previewWeatherScreen() {
    WeatherScreen(navController = rememberNavController())
}