package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import `in`.ashutoshkk.weatherapp.presentation.weather.components.Tabs
import `in`.ashutoshkk.weatherapp.presentation.weather.components.WeatherCard

@Composable
fun WeatherScreen(
    navController: NavController
) {
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = Modifier.fillMaxWidth()) {
        WeatherCard()
    }
    Tabs(selectedTabIndex){
        selectedTabIndex = it
    }
}

@Preview(showBackground = true)
@Composable
fun previewWeatherScreen() {
    WeatherScreen(navController = rememberNavController())
}