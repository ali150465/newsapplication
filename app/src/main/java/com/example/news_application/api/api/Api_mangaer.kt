package com.example.news_application.api.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Api_mangaer {
    companion object {
        private var retrofit: Retrofit? = null
        @Synchronized
        fun getInstance(): Retrofit {
            if (retrofit == null) {
                val loggingInterceptor=HttpLoggingInterceptor()
                loggingInterceptor.level=HttpLoggingInterceptor.Level.BODY
                val okHttpClient=OkHttpClient.Builder().addInterceptor(loggingInterceptor)
                retrofit = Retrofit.Builder().baseUrl("https://newsapi.org/")
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit!!
        }

        @Synchronized
        fun getApi(): Webservies {
            return getInstance().create(Webservies::class.java)

        }


    }
}
