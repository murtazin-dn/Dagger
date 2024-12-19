package com.example.dagger.di

import com.example.core.di.NetworkApiProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent: NetworkApiProvider {
}