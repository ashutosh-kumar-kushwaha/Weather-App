package `in`.ashutoshkk.weatherapp.presentation.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.ashutoshkk.weatherapp.common.Resource
import `in`.ashutoshkk.weatherapp.data.remote.dto.CurrentWeatherDto
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

    init {
        getCurrentWeather()
    }

    private val _currentWeather =
        MutableStateFlow<Resource<CurrentWeatherDto>>(Resource.Loading())
    val currentWeatherDto: StateFlow<Resource<CurrentWeatherDto>> =
        _currentWeather

    fun getCurrentWeather() {
        weatherUseCase.getCurrentWeather().onEach {
            when(it){
                is Resource.Loading -> {
                    _currentWeather.value = Resource.Loading()
                }
                is Resource.Success -> {
                    _currentWeather.value = Resource.Success(it.data!!)
                }
                is Resource.Error -> {
                    _currentWeather.value = Resource.Error(it.message!!)
                }
            }
        }.launchIn(viewModelScope)
    }

}