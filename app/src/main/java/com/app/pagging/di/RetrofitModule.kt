package com.app.pagging.di

import com.app.pagging.retrofit.QuoteApi
import com.app.pagging.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RetrofitModule {

    @Singleton
    @Provides
    fun getRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun getQuoteAPI(retrofit: Retrofit):QuoteApi{
        return retrofit.create(QuoteApi::class.java)
    }
}