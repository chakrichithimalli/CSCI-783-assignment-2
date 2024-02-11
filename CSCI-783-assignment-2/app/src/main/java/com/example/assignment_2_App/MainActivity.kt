package com.example.assignment_2_App

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startExplicitlyButton: Button = findViewById(R.id.startExplicitlyButton)
        val startImplicitlyButton: Button = findViewById(R.id.startImplicitlyButton)

        startExplicitlyButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)
            startActivity(explicitIntent)
        }

        startImplicitlyButton.setOnClickListener {
            val implicitIntent = Intent("com.example.assignmentapp.START_SECOND_ACTIVITY")
            startActivity(implicitIntent)
        }
    }
}
