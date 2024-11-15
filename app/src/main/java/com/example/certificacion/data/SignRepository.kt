package com.example.certificacion.data

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.certificacion.model.Sign

class SignRepository(private val context: Context) {

    private val signDao: SignDao = SignDatabase.getDatabase(context).signDao()

    suspend fun insertAllSigns(signs: List<Sign>) {
        signDao.insertAll(signs)
    }

    fun getAllSigns(): LiveData<List<Sign>> {
        return signDao.getAllSigns()
    }

    suspend fun getSignById(id: Int): Sign {
        return signDao.getSignById(id)
    }
}
