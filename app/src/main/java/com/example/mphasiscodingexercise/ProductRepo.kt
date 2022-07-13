package com.example.mphasiscodingexercise

import retrofit2.Response

class ProductRepo : RetroApiInterface {
    override fun getProducts(): Response<List<Product>> {
        return getProducts()
    }
}