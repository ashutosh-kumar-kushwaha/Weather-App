package `in`.ashutoshkk.weatherapp.data.remote

import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherDto
import retrofit2.http.GET

interface WeatherApiService {
    @GET("current.json?q=London")
    suspend fun getCurrentWeather(): CurrentWeatherDto
}