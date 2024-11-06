package com.example.lab10_meneses

import com.google.gson.annotations.SerializedName

data class SerieModel(
    @SerializedName("id")
    var id: Int,
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("title")
    var name: String,
    @SerializedName("body")
    var category: String
)
