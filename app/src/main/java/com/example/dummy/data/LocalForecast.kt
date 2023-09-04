package com.example.dummy.data

import androidx.room.Entity

@Entity(primaryKeys= ["label"] )
data class LocalForecast (
    val icon: String,
    val description: String,
    val temp: Double,
    val dt_txt: String,
)