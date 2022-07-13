package com.example.mphasiscodingexercise

import com.squareup.moshi.Json

data class Product(@field:Json(name = "title") var title: String?,
                   @field:Json(name = "image") var image: String?,
                   @field:Json(name = "itemDescription") var itemDescription: String?,
                   @field:Json(name = "itemQuantity") val itemQuantity: Int?,
                   @field:Json(name = "itemPrice") var itemPrice: Double?
)
