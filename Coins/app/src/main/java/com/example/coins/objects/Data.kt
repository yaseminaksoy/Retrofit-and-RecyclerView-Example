package com.example.coins.objects


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("base")
    val base: Base,
    @SerializedName("coins")
    val coins: List<Coin>,
    @SerializedName("stats")
    val stats: Stats
)