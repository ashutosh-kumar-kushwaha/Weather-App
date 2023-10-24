package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.ashutoshkk.weatherapp.R
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.productSansFamily

@Composable
fun WeatherCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(shape = RoundedCornerShape(16.dp), color = Color(0xFF6650a4))
            .paint(painterResource(id = R.drawable.weather_bg))
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Bangalore, India",
                color = Color.White,
                fontFamily = productSansFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp
            )
            Image(
                painter = painterResource(id = R.drawable.ic_search),
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp),
                contentDescription = "Search"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherCardPreview() {
    WeatherCard()
}