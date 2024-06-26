package com.example.pokemon.network

import com.example.pokemon.model.QueryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApiService {
    @GET("pokemon")
    suspend fun getPokemonResults(@Query("limit") limit: Int = 151): Response<QueryResponse>
}