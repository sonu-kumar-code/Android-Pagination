package com.app.pagging.retrofit

import com.app.pagging.models.QuoteList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {

    @GET("quotes")
    suspend fun getQuotes(@Query("page") page:Int):QuoteList
}