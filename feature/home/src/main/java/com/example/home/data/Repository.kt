package com.example.home.data

import com.example.core.di.Retrofit1
import com.example.core.di.Retrofit2
import retrofit2.Retrofit
import javax.inject.Inject

class HomeRepository @Inject constructor(
   private val retrofits: Set<Retrofit>,
){
    fun getData(){
        retrofits.forEach { retrofit ->
            println("retrofit 1 - ${retrofit.baseUrl()}")
        }
    }
}