package com.example.mphasiscodingexercise

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface RetroApiInterface {

    @GET("ea28e344-1625-4a4d-8a54-b87622a28811")
    fun getProducts() : Response<List<Product>>

        var retrofit
            get() = Retrofit.Builder()
                .baseUrl("https://mocki.io/v1/")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
                .create(RetroApiInterface::class.java)
            set(value) = TODO()

}