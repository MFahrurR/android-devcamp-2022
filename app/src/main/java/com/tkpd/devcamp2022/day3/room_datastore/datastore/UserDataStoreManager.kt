package com.tkpd.devcamp2022.day3.room_datastore.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.tkpd.devcamp2022.day3.room_datastore.model.User
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = UserDataStoreManager.USER_DATASTORE)

class UserDataStoreManager(val context: Context) {

    companion object {
        const val USER_DATASTORE = "USER_DATASTORE"

        val USER_ID = stringPreferencesKey("USER_ID")
        val IS_LOGGED_IN = booleanPreferencesKey("IS_LOGGED_IN")
        val USERNAME = stringPreferencesKey("USERNAME")
    }

    suspend fun saveToDataStore(user: User) {
        context.dataStore.edit {
            it[USER_ID] = user.id
            it[IS_LOGGED_IN] = user.isLoggedIn
            it[USERNAME] = user.userName
        }
    }

    suspend fun getUserDataStore() = context.dataStore.data.map {
        User(
            id = it[USER_ID] ?: "",
            isLoggedIn = it[IS_LOGGED_IN] ?: false,
            userName = it[USERNAME] ?: ""
        )
    }

    suspend fun clearUserDataStore() {
        context.dataStore.edit {
            it.clear()
        }
    }
}