package com.example.admin.volvocodingchallenge.di.application

import com.example.admin.volvocodingchallenge.utils.SingleEventLiveData
import dagger.Module
import dagger.Provides

@Module
class LiveDataModule {

    @Provides
    fun providesSingleEventLiveData(): SingleEventLiveData<Boolean> {
        return SingleEventLiveData()
    }
}