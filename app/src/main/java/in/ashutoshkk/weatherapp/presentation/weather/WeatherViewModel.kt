package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.ashutoshkk.weatherapp.common.Resource
import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherResponse
import `in`.ashutoshkk.weatherapp.domain.useCase.WeatherUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherUseCase: WeatherUseCase
) : ViewModel() {
    private val _currentWeatherResponse =
        MutableStateFlow<Resource<CurrentWeatherResponse>>(Resource.Loading())
    val currentWeatherResponse: StateFlow<Resource<CurrentWeatherResponse>> =
        _currentWeatherResponse

    fun getCurrentWeather() {
        weatherUseCase.getCurrentWeather().onEach {
            when(it){
                is Resource.Loading -> {
                    _currentWeatherResponse.value = Resource.Loading()
                }
                is Resource.Success -> {
                    _currentWeatherResponse.value = Resource.Success(it.data!!)
                }
                is Resource.Error -> {
                    _currentWeatherResponse.value = Resource.Error(it.message!!)
                }
            }
        }.launchIn(viewModelScope)
    }

}