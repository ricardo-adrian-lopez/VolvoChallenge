package com.example.admin.volvocodingchallenge.data.repository

import android.arch.lifecycle.MutableLiveData
import com.example.admin.volvocodingchallenge.data.remote.models.MetaWeatherResponse

interface Repository {

    val weatherForecastLiveData: MutableLiveData<List<MetaWeatherResponse>>

    fun getWeatherForecast(woeId:String)
}