package com.example.certificacion.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.certificacion.model.Sign

@Database(entities = [Sign::class], version = 1, exportSchema = false)
abstract class SignDatabase : RoomDatabase() {

    abstract fun signDao(): SignDao

    companion object {
        @Volatile
        private var INSTANCE: SignDatabase? = null

        fun getDatabase(context: Context): SignDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SignDatabase::class.java,
                    "sign_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
