package com.obedcodes.moodtracker.data.database


import androidx.room.*
import com.obedcodes.moodtracker.data.model.Mood
import kotlinx.coroutines.flow.Flow

@Dao
interface MoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMood(mood: Mood)

    @Query("SELECT * FROM mood_table ORDER BY timestamp DESC")
    fun getAllMoods(): Flow<List<Mood>>

    @Delete
    suspend fun deleteMood(mood: Mood)
}
