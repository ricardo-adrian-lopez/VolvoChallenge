package com.example.admin.volvocodingchallenge.di.activity

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import com.example.admin.volvocodingchallenge.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScope
    fun providesMainViewModel(): MainViewModel {
        return ViewModelProviders.of(activity).get(MainViewModel::class.java)
    }
}