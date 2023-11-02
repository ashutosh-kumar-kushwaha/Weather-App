package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.ashutoshkk.weatherapp.R
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.BgColor2
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.TextColor2
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.productSansFamily

@Composable
fun TabContent(tabContentTypes: TabContentTypes = TabContentTypes.Today) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
    ) {
        items(4) {
            InfoItem()
        }
    }
}

@Composable
fun InfoItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = BgColor2, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_wind_speed),
            contentDescription = "Wind Speed",
            modifier = Modifier
                .height(28.dp)
                .width(28.dp)
                .clip(RoundedCornerShape(28.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Wind Speed",
                fontFamily = productSansFamily,
                fontWeight = FontWeight.Normal,
                color = TextColor2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "12 km/h",
                fontFamily = productSansFamily,
                fontWeight = FontWeight.Normal,
                color = TextColor2
            )
        }
    }
}

@Preview
@Composable
fun PreviewTabContent() {
    TabContent()
}

enum class TabContentTypes {
    Today,
    Tomorrow,
    TenDays
}