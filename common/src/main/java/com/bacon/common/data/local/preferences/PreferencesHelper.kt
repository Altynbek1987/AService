package com.bacon.common.data.local.preferences

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesHelper @Inject constructor(private val preferences: SharedPreferences) {

    var isAuthorized: Boolean
        get() = preferences.getBoolean("signUp", false)
        set(value) = preferences.edit().putBoolean("signUp", value).apply()

    var userId: String?
        get() = preferences.getString("userId", "")
        set(value) = preferences.edit().putString("userId", value).apply()

}