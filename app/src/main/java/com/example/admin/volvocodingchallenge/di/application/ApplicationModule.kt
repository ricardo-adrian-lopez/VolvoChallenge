package com.example.admin.volvocodingchallenge.di.application

import android.content.Context
import com.example.admin.volvocodingchallenge.AppController
import com.example.admin.volvocodingchallenge.data.remote.RemoteServiceHelper
import com.example.admin.volvocodingchallenge.data.repository.Repository
import com.example.admin.volvocodingchallenge.data.repository.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: AppController) {

    @Provides
    @ApplicationScope
    fun providesApplicationContext(): Context {
        return application
    }

    @Provides
    @ApplicationScope
    fun providesRemoteServiceHelper(): RemoteServiceHelper {
        return RemoteServiceHelper()
    }

    @Provides
    @ApplicationScope
    fun providesRepositoryImpl(remoteServiceHelper: RemoteServiceHelper): Repository {
        return RepositoryImpl(remoteServiceHelper)
    }
}