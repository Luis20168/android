package data

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(private var context: Context) {

    private val namedatabase = "ME_DATABASE"
    private val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(namedatabase, Context.MODE_PRIVATE)
    }

    fun saveUser(user: String) {
        val editor = sharedPreferences.edit()
        editor.putString("key_user", user)
        editor.apply()
    }



    fun getUser(): String {
        return sharedPreferences.getString("KEY", "Empty")
    }
}