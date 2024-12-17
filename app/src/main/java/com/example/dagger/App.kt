package com.example.dagger

import android.app.Application
import com.example.dagger.di.AppComponent
import com.example.home.di.HomeDeps

class App: Application(), HomeDeps {

    val appComponent: AppComponent by lazy { DaggerAppComponent.create() }

    override fun getRetrofits() = appComponent.getRetrofits()
}