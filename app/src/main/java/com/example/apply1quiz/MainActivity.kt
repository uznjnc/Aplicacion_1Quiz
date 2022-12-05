package com.example.apply1quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.app1.R
import com.example.app1.databinding.ActivityMainBinding

private val MainActivity.Question.answer: Boolean
    get() {}
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private val quizViewModel: QuizViewModel by viewModels()

    private fun viewModels(): Any {

    }


    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )
    private var currentIndex = 0


    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer
    val currentQuestionText: Boolean
        get() = questionBank[currentIndex].answer

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size




        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d(TAG, "onCreate(Bundle?) called")

            setContentView(R.layout.activity_main)


            // binding = ActivityMainBinding.inflate(layoutInflater)
            // setContentView(binding.root)

            // binding.trueButton.setOnClickListener { view: View ->
            /* override fun onStart() {
            super.onStart()
            Log.d(TAG, "onStart() called")
        }
        override fun onResume() {
            super.onResume()
            Log.d(TAG, "onResume() called")
        }
        override fun onPause() {
            super.onPause()
            Log.d(TAG, "onPause() called")
        }
        override fun onStop() {
            super.onStop()
            Log.d(TAG, "onStop() called")
        }
        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "onDestroy() called")
        }

*/



            trueButton = findViewById(R.id.true_button)
            falseButton = findViewById(R.id.false_button)




            trueButton.setOnClickListener { view: View ->
                Toast.makeText(
                    this,
                    R.string.correct_toast,
                    Toast.LENGTH_SHORT
                ).show()


// Hacer algo en respuesta al clic aquí
            }
            falseButton.setOnClickListener { view: View ->
                Toast.makeText(
                    this,
                    R.string.incorrect_toast,
                    Toast.LENGTH_SHORT
                ).show()

// Hacer algo en respuesta al clic aquí


            }

        }
    }

    private operator fun Any.getValue(
        mainActivity: MainActivity,
        property:
    ): QuizViewModel {

    }

    class QuizViewModel {

    }

    class Question(questionAustralia: Any, b: Boolean) {

    }

}
