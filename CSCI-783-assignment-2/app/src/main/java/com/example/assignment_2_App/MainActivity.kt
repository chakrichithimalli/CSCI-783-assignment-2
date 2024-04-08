package com.example.assignment_2_App
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myapplication.R.layout.activity_main)

        val startExplicitlyButton: Button = findViewById(R.id.startExplicitlyButton)
        val startImplicitlyButton: Button = findViewById(R.id.startImplicitlyButton)
        val viewImageQualityButton : Button = findViewById(R.id.viewImageQuality)


        startExplicitlyButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondaryActivity::class.java)
            startActivity(explicitIntent)
        }

        startImplicitlyButton.setOnClickListener {
            val implicitIntent = Intent("com.example.assignmentapp.START_SECOND_ACTIVITY")
            startActivity(implicitIntent)
        }

        viewImageQualityButton.setOnClickListener {
            val implicitIntent = Intent(this, ViewImageQuality::class.java)
            startActivity(implicitIntent)
        }

    }
}
