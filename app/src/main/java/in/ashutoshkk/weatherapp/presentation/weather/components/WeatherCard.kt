package `in`.ashutoshkk.weatherapp.presentation.weather.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import `in`.ashutoshkk.weatherapp.R
import `in`.ashutoshkk.weatherapp.presentation.ui.theme.productSansFamily

@Composable
fun WeatherCard() {
    ConstraintLayout(
        modifier = Modifier
            .clip(RoundedCornerShape(32.dp))
            .paint(painterResource(id = R.drawable.weather_bg))
            .padding(top = 42.dp)
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {

        val (city, searchIcon, temp, weatherIcon, feelingLike, weather, dateTime, dayNightTemp) = createRefs()
        Text(
            text = "Bangalore, India",
            color = Color.White,
            fontFamily = productSansFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.constrainAs(city) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
        )
        Image(
            painter = painterResource(id = R.drawable.ic_search),
            modifier = Modifier
                .height(24.dp)
                .width(24.dp)
                .constrainAs(searchIcon) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },
            contentDescription = "Search"
        )
        Text(
            text = "32°",
            color = Color.White,
            fontFamily = productSansFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 72.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.constrainAs(temp) {
                top.linkTo(city.bottom, margin = 40.dp)
                start.linkTo(parent.start)
            }
        )
        Image(
            painter = painterResource(id = R.drawable.ic_cloud),
            modifier = Modifier
                .height(72.dp)
                .wrapContentWidth()
                .constrainAs(weatherIcon) {
                    top.linkTo(city.bottom, margin = 40.dp)
                    end.linkTo(parent.end)
                },
            contentDescription = "Cloud",
            contentScale = ContentScale.Fit
        )
        Text(
            text = "Feels like 30°",
            color = Color.White,
            fontFamily = productSansFamily,
            fontSize = 18.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.constrainAs(feelingLike) {
                bottom.linkTo(temp.bottom, margin = 16.dp)
                start.linkTo(temp.end)
            }
        )
        Text(
            text = "Cloudy",
            color = Color.White,
            fontFamily = productSansFamily,
            fontSize = 22.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .constrainAs(weather) {
                    top.linkTo(weatherIcon.bottom, margin = 8.dp)
                    start.linkTo(weatherIcon.start)
                    end.linkTo(weatherIcon.end)
                    width = Dimension.fillToConstraints
                },
        )
        Text(
            text = "Today, 10:30 PM",
            color = Color.White,
            fontFamily = productSansFamily,
            fontSize = 18.sp,
            modifier = Modifier.constrainAs(dateTime) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            }
        )
        Text(
            text = "Day 32°\nNight 24°",
            color = Color.White,
            textAlign = TextAlign.End,
            fontFamily = productSansFamily,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(dayNightTemp) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun WeatherCardPreview() {
    WeatherCard()
}