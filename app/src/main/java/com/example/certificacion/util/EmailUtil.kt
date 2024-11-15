package com.example.certificacion.util

import android.content.Context
import android.content.Intent
import android.net.Uri

object EmailUtil {
    fun sendEmail(context: Context, signName: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:tuhoroscopodiario@gmail.com")
            putExtra(Intent.EXTRA_SUBJECT, "Información sobre mi Horóscopo - $signName")
            putExtra(Intent.EXTRA_TEXT, "Solicito más información sobre mi signo $signName, además, quiero suscribirme al horóscopo diario y las últimas noticias.")
        }
        context.startActivity(intent)
    }
}
