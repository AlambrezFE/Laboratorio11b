package com.progmovil.laboratorio11b.model

data class PokemonResponse(
    val abilities: List<AbilityXX>,
    val base_experience: Int,
    val forms: List<Form>
)