package com.example.news_application.api.api

import com.example.news_application.api.api.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Webservies {
    @GET("v2/top-headlines/sources")
    fun getSources(
        @Query("apiKey") apiKey: String,
        @Query("category") category: String
    ): Call<Response>

    @GET("v2/everything")
    fun getNews(
        @Query("apiKey") apiKey: String, @Query("sources") sources: String
    ): Call<Response>

}