package `in`.ashutoshkk.weatherapp.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import `in`.ashutoshkk.weatherapp.common.Constants.BASE_URL
import `in`.ashutoshkk.weatherapp.data.remote.WeatherApiService
import `in`.ashutoshkk.weatherapp.data.repository.WeatherRepositoryImpl
import `in`.ashutoshkk.weatherapp.domain.repository.WeatherRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {
    @Provides
    fun providesWeatherApiService() =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)

    @Binds
    abstract fun bindWeatherRepository(weatherRepository: WeatherRepositoryImpl): WeatherRepository
}