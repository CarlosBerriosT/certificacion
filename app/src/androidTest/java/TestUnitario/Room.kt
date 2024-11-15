package TestUnitario

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.certificacion.data.SignDao
import com.example.certificacion.data.SignDatabase
import com.example.certificacion.model.Sign
import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

// Test de base de datos Room
@RunWith(AndroidJUnit4::class)
class SignDaoTest {

    private lateinit var db: SignDatabase
    private lateinit var signDao: SignDao

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, SignDatabase::class.java).build()
        signDao = db.signDao()
    }

    @Test
    fun insertAndGetSign() = runBlocking {
        val sign = Sign(id = 1, name = "Test Sign")
        signDao.insertAll(listOf(sign))

        val retrievedSign = signDao.getSignById(1)
        assertNotNull(retrievedSign)
        assertEquals(sign.name, retrievedSign.name)
    }

    private fun Sign(id: Int, name: String): Sign {



    @After
    fun close() {
        db.close()
    }

        return TODO("Provide the return value")
    }
    }
