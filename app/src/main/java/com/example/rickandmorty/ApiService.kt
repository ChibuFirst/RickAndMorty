package com.example.rickandmorty

import com.example.rickandmorty.Characters
import retrofit2.Call
import retrofit2.http.GET

private const val BASE_URL = "https://rickandmortyapi.com/"

interface ApiService {
    /*@GET("/api/character")
    fun getAllCharacters(): Call<List<Characters>>*/

    @GET("/api/character")
    fun getAllCharacters(): Call<ResponseData>
}