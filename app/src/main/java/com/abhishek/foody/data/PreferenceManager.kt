package com.abhishek.foody.data

import android.content.Context
import android.util.Log
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.emptyPreferences
import androidx.datastore.preferences.preferencesKey
import com.abhishek.foody.di.ApplicationScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "PreferenceManager"

data class FilterPreferences(val sortOrder: SortOrder)

@Singleton
class PreferenceManager @Inject constructor(@ApplicationScope context: Context) {
    private val dataStore = context.createDataStore("user_preferences")

    val preferenceFlow = dataStore.data
        .catch {
            exception ->
            if (exception is IOException) {
                Log.e(TAG, "Error reading preferences: ", exception)
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map {
        preferences ->
        val sortOrder = SortOrder.valueOf(
            preferences[PreferenceKeys.SORT_ORDER] ?: SortOrder.BY_LOCATION.name
        )
        FilterPreferences(sortOrder)
    }

    suspend fun updateSortOrder(sortOrder: SortOrder) {
         dataStore.edit { preferences ->
             preferences[PreferenceKeys.SORT_ORDER] = sortOrder.name
         }
    }

    private object PreferenceKeys {
        val SORT_ORDER = preferencesKey<String>("sort_order")
    }
}

enum class SortOrder { BY_NAME, BY_LOCATION}