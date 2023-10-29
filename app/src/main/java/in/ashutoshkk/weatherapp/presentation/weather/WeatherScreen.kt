package `in`.ashutoshkk.weatherapp.presentation.weather

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.BgColor1
import `in`.ashutoshkk.weatherapp.presentation.weather.components.Tabs
import `in`.ashutoshkk.weatherapp.presentation.weather.components.WeatherCard

@Composable
fun WeatherScreen(
    navController: NavController
) {
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = Modifier.fillMaxWidth().background(BgColor1)) {
        WeatherCard()
        Spacer(modifier = Modifier.height(18.dp))
        Tabs(selectedTabIndex){
            selectedTabIndex = it
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewWeatherScreen() {
    WeatherScreen(navController = rememberNavController())
}