package com.example.core.di

import retrofit2.Retrofit

interface NetworkApi {
    fun getRetrofits(): Set<Retrofit>
}