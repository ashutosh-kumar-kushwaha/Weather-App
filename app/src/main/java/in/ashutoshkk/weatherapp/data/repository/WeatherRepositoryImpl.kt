package `in`.ashutoshkk.weatherapp.data.repository

import `in`.ashutoshkk.weatherapp.data.remote.WeatherApiService
import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherDto
import `in`.ashutoshkk.weatherapp.domain.repository.WeatherRepository

class WeatherRepositoryImpl(
    private val weatherApiService: WeatherApiService
) : WeatherRepository {
    override suspend fun getCurrentWeather(): CurrentWeatherDto {
        return weatherApiService.getCurrentWeather()
    }
}