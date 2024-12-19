package com.example.dagger.di

import com.example.core.di.NetworkApi
import com.example.core.di.NetworkComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideNetworkApi(): NetworkApi = NetworkComponent.init()
}