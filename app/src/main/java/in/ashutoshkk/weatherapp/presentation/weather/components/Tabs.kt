package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.BgColor1
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.Color1
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.TextColor1

@Composable
fun Tabs(selectedTabIndex: Int = 0, onTabSelected: (Int) -> Unit = {}) {
    val titles = listOf("Today", "Tomorrow", "10 Days")
    TabRow(
        selectedTabIndex = selectedTabIndex,
        indicator = {},
        divider = {},
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .background(Color.White)
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(
                        text = title,
                        color = if (selectedTabIndex == index) {
                            TextColor1
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
                    .background(BgColor1)
                    .padding(start = if(index == 0) 0.dp else 16.dp)
                    .fillMaxWidth()
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

@Preview(showBackground = true, widthDp = 640)
@Composable
fun PreviewTabs() {
    Tabs()
}