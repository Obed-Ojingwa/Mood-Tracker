package com.obedcodes.moodtracker.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mood_table")
data class Mood(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val moodType: String,
    val intensity: Int,
    val timestamp: Long,
    val note: String? = null
)
