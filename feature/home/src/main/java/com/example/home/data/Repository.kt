package com.example.home.data

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