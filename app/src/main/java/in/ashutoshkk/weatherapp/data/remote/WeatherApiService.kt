package `in`.ashutoshkk.weatherapp.data.remote

import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherResponse
import retrofit2.http.GET

interface WeatherApiService {
    @GET("current.json?q=London")
    suspend fun getCurrentWeather(): CurrentWeatherResponse
}