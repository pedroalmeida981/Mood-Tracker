package com.example.moodtracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dailyCheckInButton: Button = findViewById(R.id.daily_check_in)
        dailyCheckInButton.setOnClickListener {
            // Navigate to Mood Logging Screen
            val intent = Intent(this, MoodLoggingActivity::class.java)
            startActivity(intent)
        }

        // Setup mood selector (add emojis or color buttons)
        setupMoodSelector()

        // Initialize Bottom Navigation View
        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_history -> {
                    startActivity(Intent(this, MoodHistoryActivity::class.java))
                    true
                }
                R.id.action_stats -> {
                    startActivity(Intent(this, StatisticsActivity::class.java))
                    true
                }
                R.id.action_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }

    private fun setupMoodSelector() {
        val moodSelector: GridLayout = findViewById(R.id.mood_selector)

        // Example mood data
        val moods = listOf(
            Pair("😊", "Happy"), // Emoji and description
            Pair("😐", "Neutral"),
            Pair("😢", "Sad"),
            Pair("😠", "Angry")
        )

        // Loop through moods and create buttons dynamically
        moods.forEach { (emoji, description) ->
            val button = Button(this).apply {
                text = emoji
                setOnClickListener {
                    // Handle mood selection (e.g., save to user input)
                    Toast.makeText(this@MainActivity, "Selected mood: $description", Toast.LENGTH_SHORT).show()
                    // Here you can also save the mood selection or update the UI accordingly
                }
            }
            // Add the button to the mood selector
            moodSelector.addView(button)
        }
    }
}
