package com.example.coins.objects


import com.google.gson.annotations.SerializedName

data class Base(
    @SerializedName("sign")
    val sign: String,
    @SerializedName("symbol")
    val symbol: String
)