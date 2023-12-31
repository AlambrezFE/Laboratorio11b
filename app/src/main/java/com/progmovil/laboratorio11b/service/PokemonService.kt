package com.progmovil.laboratorio11b.service

import com.progmovil.laboratorio11b.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    @GET("pokemon/{pokemonNumber}/")
    suspend fun getPokemon(@Path("pokemonNumber") pokemonNumber: Int): PokemonResponse
}

