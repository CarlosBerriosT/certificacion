package com.example.certificacion.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.certificacion.R
import com.example.certificacion.ui.fragment.SignListFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuración de la navegación
        if (savedInstanceState == null) {
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment?
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SignListFragment())
                .commitNow()
        }
    }
}
