package com.example.assignment_2_App

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val textViewChallenges = findViewById<TextView>(R.id.textViewChallenges)
        textViewChallenges.text = getString(R.string.challenges_list)
    }
}
