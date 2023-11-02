package `in`.ashutoshkk.weatherapp.domain.repository

import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherDto

interface WeatherRepository {
    suspend fun getCurrentWeather(): CurrentWeatherDto
}