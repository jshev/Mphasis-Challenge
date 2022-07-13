package com.example.mphasiscodingexercise

import retrofit2.Response

class MainViewModel(repo: ProductRepo) {

    lateinit var productList: List<Product>

    fun getProducts(res: Response<List<Product>>) {
        if (res.isSuccessful) {
            productList = res.body()!!
        }
    }

}