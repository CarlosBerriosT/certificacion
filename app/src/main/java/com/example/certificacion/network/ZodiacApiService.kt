package com.example.certificacion.network

import com.example.certificacion.model.Sign
import com.example.certificacion.model.SignDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface ZodiacApiService {

    @GET("es/sign")
    suspend fun getAllSigns(): List<Sign>

    @GET("es/sign/{id}")
    suspend fun getSignDetail(@Path("id") id: Int): SignDetail
}
