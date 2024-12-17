package com.example.core.di

import dagger.Component
import retrofit2.Retrofit

@NetworkScope
@Component(modules = [RetrofitModule::class])
interface NetworkComponent {

    fun getRetrofits(): Set<Retrofit>

    companion object {
        @Volatile
        private var networkComponent: NetworkComponent? = null

        @Synchronized
        fun init(): NetworkComponent {
            if (networkComponent == null) {
                networkComponent = DaggerNetworkComponent.create()
            }
            return networkComponent!!
        }
    }

}
