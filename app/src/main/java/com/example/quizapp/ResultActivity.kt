package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.quizapp.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    private var username: String? = null // Username from starting screen
    private var correct: String? = null // Total Questions gotten right
    private var total: String? = null //Total Questions given in Quiz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN // remove status bar

        username = intent.getStringExtra(Constants.username) // Get username from intent
        correct = intent.getStringExtra(Constants.correctAnswers) // Get answeredCorrect from intent
        total = intent.getStringExtra(Constants.totalQuestions) // Get total questions from intent


        binding.tvScore.text = "$correct / $total" // Set the score textView
        binding.tvUsername.text = username // Set the Username TextView

        // When the Finish button is pressed start the app over
        binding.btnEnd.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}