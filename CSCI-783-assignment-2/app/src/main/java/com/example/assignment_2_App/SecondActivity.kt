package com.example.assignment_2_App
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val textViewChallenges = findViewById<TextView>(R.id.textViewChallenges)
        val challengesList = resources.getStringArray(R.array.challenges_list_array)
        val formattedChallenges = StringBuilder()

        for ((index, challenge) in challengesList.withIndex()) {
            formattedChallenges.append("${index + 1}. $challenge\n")
        }

        textViewChallenges.text = formattedChallenges.toString()
    }
}
