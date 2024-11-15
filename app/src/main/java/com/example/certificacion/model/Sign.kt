package com.example.certificacion.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sign_table")
data class Sign(
    @PrimaryKey val id: Int,
    val name: String,
    val dates: String,
    val element: String,
    val planetRegent: String,
    val symbol: String,
    val color: String,
    val logo: String
)
