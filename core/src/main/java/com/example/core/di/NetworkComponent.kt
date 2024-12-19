package com.example.core.di

import dagger.Component

@NetworkScope
@Component(modules = [RetrofitModule::class])
interface NetworkComponent : NetworkApi {

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
