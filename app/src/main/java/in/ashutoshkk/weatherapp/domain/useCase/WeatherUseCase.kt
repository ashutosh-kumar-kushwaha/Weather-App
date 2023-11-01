package `in`.ashutoshkk.weatherapp.domain.useCase

import `in`.ashutoshkk.weatherapp.common.Resource
import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherResponse
import `in`.ashutoshkk.weatherapp.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
){
    fun getCurrentWeather() : Flow<Resource<CurrentWeatherResponse>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(weatherRepository.getCurrentWeather()))
        }
        catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            e.printStackTrace()
        }
        catch (e: Exception) {
            emit(Resource.Error("Couldn't reach the server. Check your internet connection"))
            e.printStackTrace()
        }
    }
}