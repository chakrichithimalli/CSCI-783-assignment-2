package com.example.assignment_2_App
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.Manifest
import androidx.core.app.ActivityCompat
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myapplication.R.layout.activity_main)
        val REQUEST_CODE = 100
        val startExplicitlyButton: Button = findViewById(R.id.startExplicitlyButton)
        val startImplicitlyButton: Button = findViewById(R.id.startImplicitlyButton)
        val viewImageQualityButton: Button = findViewById(R.id.viewImageQuality)


        startExplicitlyButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondaryActivity::class.java)
            startActivity(explicitIntent)
        }

        startImplicitlyButton.setOnClickListener {
            val implicitIntent = Intent("com.example.assignmentapp.START_SECOND_ACTIVITY")
            startActivity(implicitIntent)
        }
        viewImageQualityButton.setOnClickListener {
            // Check camera permission before starting the activity to capture image
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CAMERA
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // Requesting the permission for camera using the Manifest
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CAMERA),
                    REQUEST_CODE
                )
            } else {
                // if Permission already granted, ViewImageActivity to capture image
                startActivity(Intent(this, ViewImageQuality::class.java))
            }
        }
    }
}
