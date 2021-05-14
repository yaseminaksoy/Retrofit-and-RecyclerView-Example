package com.example.coins.objects


import com.google.gson.annotations.SerializedName

data class Coin(
    @SerializedName("allTimeHigh")
    val allTimeHigh: AllTimeHigh,
    @SerializedName("approvedSupply")
    val approvedSupply: Boolean,
    @SerializedName("change")
    val change: Double,
    @SerializedName("circulatingSupply")
    val circulatingSupply: Double,
    @SerializedName("color")
    val color: String?,
    @SerializedName("confirmedSupply")
    val confirmedSupply: Boolean,
    @SerializedName("description")
    val description: String?,
    @SerializedName("firstSeen")
    val firstSeen: Long,
    @SerializedName("history")
    val history: List<String>,
    @SerializedName("iconType")
    val iconType: String,
    @SerializedName("iconUrl")
    val iconUrl: String,
    @SerializedName("id")
    val id: Double,
    @SerializedName("links")
    val links: List<Link>,
    @SerializedName("listedAt")
    val listedAt: Double,
    @SerializedName("marketCap")
    val marketCap: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("numberOfExchanges")
    val numberOfExchanges: Double,
    @SerializedName("numberOfMarkets")
    val numberOfMarkets: Double,
    @SerializedName("penalty")
    val penalty: Boolean,
    @SerializedName("price")
    val price: Double,
    @SerializedName("rank")
    val rank: Double,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("socials")
    val socials: List<Social>,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("totalSupply")
    val totalSupply: Double?,
    @SerializedName("type")
    val type: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("volume")
    val volume: Long,
    @SerializedName("websiteUrl")
    val websiteUrl: String?
)