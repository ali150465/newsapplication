package com.example.news_application.api.api.model

import com.google.gson.annotations.SerializedName

data class Response(

    @field:SerializedName("sources")
	val sources: List<SourcesItem?>? = null,

    @field:SerializedName("status")
	val status: String? = null,
    @field:SerializedName("code")
    val code: String? = null,
    @field:SerializedName("message")
    val message: String? = null

)