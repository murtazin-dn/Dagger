package com.example.core.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
internal class RetrofitModule{

    @NetworkScope
    @Provides
    @IntoSet
    fun provideRetrofitServer1(): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://server1.example.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @NetworkScope
    @Provides
    @IntoSet
    fun provideRetrofitServer2(): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://server2.example.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}
