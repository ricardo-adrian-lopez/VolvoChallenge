package com.example.admin.volvocodingchallenge.di.application

import com.example.admin.volvocodingchallenge.di.activity.ActivityComponent
import com.example.admin.volvocodingchallenge.di.activity.ActivityModule
import com.example.admin.volvocodingchallenge.ui.MainViewModel
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class, LiveDataModule::class])
interface ApplicationComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

    fun inject(mainViewModel: MainViewModel)
}