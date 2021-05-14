package com.example.coins


import com.example.coins.objects.Coins
import retrofit2.Call
import retrofit2.http.GET

interface CoinsApi {
    @GET("coins")
    fun getCoins(): Call<Coins>
}