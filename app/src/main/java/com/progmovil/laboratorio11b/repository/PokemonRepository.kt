package com.progmovil.laboratorio11b.repository

import com.progmovil.laboratorio11b.model.PokemonResponse
import com.progmovil.laboratorio11b.service.RetrofitInstance

class PokemonRepository {
    private val pokemonService = RetrofitInstance.pokemonService

    suspend fun getPokemon(pokemonNumber: Int): PokemonResponse {
        return pokemonService.getPokemon(pokemonNumber)
    }
}

