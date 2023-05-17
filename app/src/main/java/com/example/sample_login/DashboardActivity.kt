package com.example.sample_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    lateinit var welcomeText: String
    lateinit var tvWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // register all the ImageButtons with their appropriate IDs
        val backB: ImageButton = findViewById(R.id.backB)
        val logOutB: ImageButton = findViewById(R.id.logOutB)
        val profileB: ImageButton = findViewById(R.id.tvProfileB)

        // register all the Buttons with their appropriate IDs
        val todoB: Button = findViewById(R.id.tvTodoB)
        val editProfileB: Button = findViewById(R.id.tvEditProfileB)

        // register all the card views with their appropriate IDs
        val fruitGameCard: CardView = findViewById(R.id.fruitGameCard)
        val snakeGameCard: CardView = findViewById(R.id.snakeGameCard)
        val leaderboardCard: CardView = findViewById(R.id.leaderboardCard)
        val galleryCard: CardView = findViewById(R.id.galleryCard)
        val helpCard: CardView = findViewById(R.id.helpCard)
        val settingsCard: CardView = findViewById(R.id.settingsCard)

        //to welcome the User
        welcomeText = "Welcome " + getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);

        // handle each of the image buttons with the OnClickListener
        backB.setOnClickListener {
            Toast.makeText(this, "Back Button", Toast.LENGTH_SHORT).show()
        }
        logOutB.setOnClickListener {
            Toast.makeText(this, "Logout Button", Toast.LENGTH_SHORT).show()
        }
        profileB.setOnClickListener {
            Toast.makeText(this, "Profile Image", Toast.LENGTH_SHORT).show()
        }


        // handle each of the buttons with the OnClickListener
        todoB.setOnClickListener {
            Toast.makeText(this, "TODO LIST", Toast.LENGTH_SHORT).show()
        }
        editProfileB.setOnClickListener {
            Toast.makeText(this, "Editing Profile", Toast.LENGTH_SHORT).show()
        }


        // handle each of the cards with the OnClickListener
        fruitGameCard.setOnClickListener {


            Toast.makeText(this, "Contribute Articles", Toast.LENGTH_SHORT).show()
        }
        snakeGameCard.setOnClickListener {
            Toast.makeText(this, "Practice Programming", Toast.LENGTH_SHORT).show()
        }
        leaderboardCard.setOnClickListener {
            Toast.makeText(this, "Learn Programming", Toast.LENGTH_SHORT).show()
        }
        galleryCard.setOnClickListener {
            Toast.makeText(this, "Filter your Interests", Toast.LENGTH_SHORT).show()
        }
        helpCard.setOnClickListener {
            Toast.makeText(this, "Anything Help you want?", Toast.LENGTH_SHORT).show()
        }
        settingsCard.setOnClickListener {
            Toast.makeText(this, "Change the settings", Toast.LENGTH_SHORT).show()
        }

    }
}
