package com.example.home.di

import com.example.home.presentation.HomeFragment
import dagger.Component
import dagger.Component.Factory

@HomeScope
@Component(dependencies = [HomeDeps::class])
interface HomeComponent {

    @Component.Factory
    interface Factory{
        fun create(deps: HomeDeps): HomeComponent
    }

    fun inject(fragment: HomeFragment)
}