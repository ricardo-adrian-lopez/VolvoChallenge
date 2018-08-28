package com.example.admin.volvocodingchallenge.data.remote

import com.example.admin.volvocodingchallenge.data.remote.models.MetaWeatherResponse
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface RemoteService {
    @GET("api/location/{woeid}/{date}")
    fun getWeatherForecast(@Path("woeid") woeId: String, @Path("date") date: String): Deferred<List<MetaWeatherResponse>>

}