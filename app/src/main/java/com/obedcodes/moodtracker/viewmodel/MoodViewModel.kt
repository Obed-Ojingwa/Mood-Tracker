package com.obedcodes.moodtracker.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.obedcodes.moodtracker.data.database.MoodDao
import com.obedcodes.moodtracker.data.model.Mood
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoodViewModel(private val moodDao: MoodDao) : ViewModel() {

    val allMoods = moodDao.getAllMoods()

    fun addMood(mood: Mood) {
        viewModelScope.launch(Dispatchers.IO) {
            moodDao.insertMood(mood)
        }
    }

    fun deleteMood(mood: Mood) {
        viewModelScope.launch(Dispatchers.IO) {
            moodDao.deleteMood(mood)
        }
    }
}
