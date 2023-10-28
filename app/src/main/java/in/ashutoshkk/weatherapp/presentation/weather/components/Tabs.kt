package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.Color1

@Composable
fun Tabs(selectedTabIndex: Int = 0, onTabSelected: (Int) -> Unit = {}) {
    val titles = listOf("Today", "Tomorrow", "Next 10 Days")
    TabRow(
        selectedTabIndex = selectedTabIndex,
        Modifier.background(Color.Black),
        indicator = { tabPositions ->
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color1, RoundedCornerShape(16.dp))
            )
        }
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(
                        text = title,
                        color = if (selectedTabIndex == index) {
                            Color.Red
                        } else {
                            Color.Black
                        }
                    )
                },
                selected = selectedTabIndex == index,
                onClick = {
                    onTabSelected(index)
                },
                modifier = Modifier
                    .background(
                        color = if (selectedTabIndex == index) {
                            Color1
                        } else {
                            Color.White
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTabs() {
    Tabs()
}