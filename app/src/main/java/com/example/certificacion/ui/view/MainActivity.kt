package com.example.certificacion.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.certificacion.R
import com.example.certificacion.ui.fragment.SignListFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuración de la navegación
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SignListFragment())
                .commitNow()
        }
    }
}
