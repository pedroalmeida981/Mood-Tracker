package com.example.moodtracker

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MoodLoggingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_logging)

        val saveButton: Button = findViewById(R.id.save_button)
        saveButton.setOnClickListener {
            // Save the mood and note
            saveMood()
        }
    }

    private fun saveMood() {
        // Logic to save mood and note
    }
}
