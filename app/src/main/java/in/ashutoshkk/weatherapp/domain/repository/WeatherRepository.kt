package `in`.ashutoshkk.weatherapp.domain.repository

import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherResponse

interface WeatherRepository {
    suspend fun getCurrentWeather(): CurrentWeatherResponse
}