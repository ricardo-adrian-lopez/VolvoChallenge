package com.example.admin.volvocodingchallenge.di.activity

import com.example.admin.volvocodingchallenge.ui.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}