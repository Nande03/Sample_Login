package com.example.sample_login

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    lateinit var welcomeText: String
    lateinit var tvWelcome: TextView
    lateinit var fruit: ImageView
    lateinit var snake: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard);

        welcomeText = "Welcome " + getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);

        this.findViewById<ImageView>(R.id.snake).setOnClickListener {
            startActivity(Intent(this, SnakeActivity::class.java))

            this.findViewById<ImageView>(R.id.fruit).setOnClickListener() {
                startActivity(Intent(this, CatchingFruits::class.java))
            }

        }
    }
}