package com.example.news_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.news_application.api.api.Api_mangaer
import com.example.news_application.api.api.model.Response
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    val apiKey:String="f5b5a76d906a4a1bb935a8f93ffc8da5"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Api_mangaer.getApi().getSources(apiKey).enqueue(object :Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                Log.e("responce",response.body().toString())
                Log.e("responce is successful",response.isSuccessful.toString())
                Log.e("responce body",response.body().toString())
                Log.e("error body",response.errorBody()?.string()?:"")


            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                Log.e("error",t.localizedMessage?:"")
            }


        })
    }
}