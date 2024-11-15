package com.example.certificacion.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.certificacion.model.Sign


@Dao
interface SignDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(signs: List<Sign>)

    @Query("SELECT * FROM sign_table")
    fun getAllSigns(): LiveData<List<Sign>>

    @Query("SELECT * FROM sign_table WHERE id = :id")
    suspend fun getSignById(id: Int): Sign
}
