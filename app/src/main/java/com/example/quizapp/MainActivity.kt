package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN // remove status bar

        binding.Start.setOnClickListener {
            if(binding.enteredText.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            }
            else {
               val intent = Intent(this, QuizQuestionsActivity::class.java)
                val username = binding.enteredText.text.toString()
                intent.putExtra(Constants.username, username)
                startActivity(intent)
            }
        }
    }

}