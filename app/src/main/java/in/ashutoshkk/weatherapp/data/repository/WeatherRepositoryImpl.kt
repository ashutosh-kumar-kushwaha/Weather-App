package `in`.ashutoshkk.weatherapp.data.repository

import `in`.ashutoshkk.weatherapp.data.remote.WeatherApiService
import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherResponse
import `in`.ashutoshkk.weatherapp.domain.repository.WeatherRepository

class WeatherRepositoryImpl(
    private val weatherApiService: WeatherApiService
) : WeatherRepository {
    override suspend fun getCurrentWeather(): CurrentWeatherResponse {
        return weatherApiService.getCurrentWeather()
    }
}