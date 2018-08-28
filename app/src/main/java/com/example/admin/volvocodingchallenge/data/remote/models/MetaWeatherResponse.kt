package com.example.admin.volvocodingchallenge.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MetaWeatherResponse {

    @SerializedName("id")
    @Expose
    var id: Long? = null
    @SerializedName("weather_state_name")
    @Expose
    var weatherStateName: String? = null
    @SerializedName("weather_state_abbr")
    @Expose
    var weatherStateAbbr: String? = null
    @SerializedName("wind_direction_compass")
    @Expose
    var windDirectionCompass: String? = null
    @SerializedName("created")
    @Expose
    var created: String? = null
    @SerializedName("applicable_date")
    @Expose
    var applicableDate: String? = null
    @SerializedName("min_temp")
    @Expose
    var minTemp: Any? = null
    @SerializedName("max_temp")
    @Expose
    var maxTemp: Any? = null
    @SerializedName("the_temp")
    @Expose
    var theTemp: Double? = null
    @SerializedName("wind_speed")
    @Expose
    var windSpeed: Double? = null
    @SerializedName("wind_direction")
    @Expose
    var windDirection: Double? = null
    @SerializedName("air_pressure")
    @Expose
    var airPressure: Double? = null
    @SerializedName("humidity")
    @Expose
    var humidity: Int? = null
    @SerializedName("visibility")
    @Expose
    var visibility: Double? = null
    @SerializedName("predictability")
    @Expose
    var predictability: Int? = null

}
