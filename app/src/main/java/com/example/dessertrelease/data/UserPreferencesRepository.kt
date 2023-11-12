package com.example.dessertrelease.data

import kotlinx.coroutines.flow.Flow

interface UserPreferencesRepository {
    val isLinearLayout: Flow<Boolean>
    suspend fun saveLayoutPreferences(isLinearLayout: Boolean)
}