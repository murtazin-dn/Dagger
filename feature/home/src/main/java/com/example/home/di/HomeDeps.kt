package com.example.home.di

import retrofit2.Retrofit

interface HomeDeps{
    fun getRetrofits(): Set<Retrofit>
}