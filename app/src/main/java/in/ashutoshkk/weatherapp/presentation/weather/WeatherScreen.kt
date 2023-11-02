package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
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
import `in`.ashutoshkk.weatherapp.presentation.weather.components.TabContent
import `in`.ashutoshkk.weatherapp.presentation.weather.components.Tabs
import `in`.ashutoshkk.weatherapp.presentation.weather.components.WeatherCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WeatherScreen(
    navController: NavController
) {
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
    val pagerState = rememberPagerState(pageCount = { 3 })
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(BgColor1)
    ) {
        WeatherCard()
        Spacer(modifier = Modifier.height(18.dp))
        Tabs(selectedTabIndex) {
            selectedTabIndex = it
        }
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) { page ->
            when (page) {
                0 -> {
                    TabContent()
                }

                1 -> {
                    // Tomorrow
                }

                2 -> {
                    // 10 Days
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewWeatherScreen() {
    WeatherScreen(navController = rememberNavController())
}