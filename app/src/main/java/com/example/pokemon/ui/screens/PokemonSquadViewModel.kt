package com.example.pokemon.ui.screens

import androidx.lifecycle.ViewModel
import com.example.pokemon.model.Pokemon
import com.example.pokemon.ui.PokemonSquadUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokemonSquadViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(PokemonSquadUiState())
    val uiState: StateFlow<PokemonSquadUiState> = _uiState.asStateFlow()

    fun addPokemon(pokemon: Pokemon) {
        val updatedSquad = _uiState.value.pokemonSquad.toMutableList()
        updatedSquad.add(pokemon)
        _uiState.value = _uiState.value.copy(pokemonSquad = updatedSquad)
}

//
    }