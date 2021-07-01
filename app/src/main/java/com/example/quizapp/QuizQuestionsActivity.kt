package com.example.quizapp

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quizapp.databinding.ActivityQuizQuestionsBinding
import java.util.ArrayList

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityQuizQuestionsBinding

    private var mAnsweredCorrect = 0 // Number of Correct answers
    private var mCurrentPosition: Int = 1 // Current Position on the QuestionList
    private var mQuestionList: ArrayList<Question>? = null // List of constant questions
    private var mSelectedPosition: Int = 0 // Which TextView the User has selected
    private var mUsername:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mUsername = intent.getStringExtra(Constants.username)


        mQuestionList = Constants.getQuestions() // Populate the QuestionList with the constants
        setupQuestion() // Set the first question from the QuestionList


        // onCLickListeners
        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)
        binding.submit.setOnClickListener {buttonListener()}
    }

    // Listener Function created for when the button is pressed. It will check if an option has been
    // pressed, if it has it well then check if it is the same as the given correct answer in the
    // Constants file for that Question. Then set up the next screen of the app based on which question
    // is currently up
    private fun buttonListener() {
        if (mSelectedPosition != 0) { // if the user has selected an option
            // If the selected Option is equal to the Questions answer
            if (mQuestionList!![mCurrentPosition - 1].correctAnswer == mSelectedPosition) {
                mAnsweredCorrect++ // Add one to AnsweredCorrect
            }

            if(mCurrentPosition == binding.progressBar.max) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(Constants.username, mUsername)
                intent.putExtra(Constants.correctAnswers, (mAnsweredCorrect).toString())
                intent.putExtra(Constants.totalQuestions, (mQuestionList!!.size).toString())
                startActivity(intent)
                //finish()

            } else {

                mCurrentPosition++ // Go the next index on the QuestionList
                mSelectedPosition = 0 // Set Selected Option back to 0

                // set up for a new Question
                setupQuestion()
                defaultOptions()
            }
        } else {
            // Tell user to selected an Answer
            Toast.makeText(this, "Please Select an Answer", Toast.LENGTH_SHORT).show()
        }

    }

    // Function to set the next question when submit is pressed, also counts the amount of questions
    // and fills the progressbar based on how many questions have been answered.
    private fun setupQuestion() {

        val question: Question = mQuestionList!![mCurrentPosition - 1]
        binding.progressBar.max = mQuestionList?.size ?: 10
        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition / ${binding.progressBar.max}"
        binding.tvQuestion.text = question.question
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour

        if(mCurrentPosition == mQuestionList!!.size){ // If this is the last question
            binding.submit.text = "FINISH" // Change Submit to Finish
        }
    }

    // Function that sets the text back to its default, unselected border. used when the submit
    // button is pressed to give uniform look until the user selects a option.
    private fun defaultOptions() {
        val options = ArrayList<TextView>()
        options.add(0, binding.optionOne)
        options.add(1, binding.optionTwo)
        options.add(2, binding.optionThree)
        options.add(3, binding.optionFour)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_options_border_bg)
        }
    }

    // the OnClick method of this class
    override fun onClick(v: View?) {
        when (v?.id) {
            binding.optionOne.id -> {
                optionView(binding.optionOne, 1)
            }
            binding.optionTwo.id -> {
                optionView(binding.optionTwo, 2)
            }
            binding.optionThree.id -> {
                optionView(binding.optionThree, 3)
            }
            binding.optionFour.id -> {
                optionView(binding.optionFour, 4)
            }
        }

    }

    // Function that changes the outline of the selected textview when called. This lets the users
    // more easily identify what option they have selected.
    private fun optionView(tv: TextView, selected: Int){
        defaultOptions()
        mSelectedPosition = selected

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.typeface = Typeface.DEFAULT
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border)

    }
}