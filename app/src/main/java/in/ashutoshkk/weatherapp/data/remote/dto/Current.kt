package `in`.ashutoshkk.weatherapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Current(
    val condition: Condition,
    @SerializedName("feelslike_c") val feelsLikeC: Double,
    @SerializedName("feelslike_f") val feelsLikeF: Double,
    @SerializedName("last_updated") val lastUpdated: String,
    @SerializedName("last_updated_epoch") val lastUpdatedEpoch: Int,
    @SerializedName("temp_c") val tempC: Double,
    @SerializedName("temp_f") val tempF: Double
)