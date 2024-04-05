package com.example.historyapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    private lateinit var background_image_view: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)
        background_image_view = findViewById(R.id.background_image_view)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {
                val celebrityName = when (age) {
                    95 -> "Nelson Mandela"
                    52 -> "William Shakespeare"
                    32 -> "Bruce Lee"
                    27 -> "Kurt Cobain"
                    36 -> "Princess Diana"
                    28 -> "Heath Ledger"
                    35 -> "Mozart"
                    40 -> "John Lennon"
                    43 -> "Elvis Presley"
                    50 -> "Michael Jackson"
                    else -> null
                }
                val message = if (celebrityName != null) "The celebrity who passed away at age $age: $celebrityName"
                else "No celebrity found with the entered age."
                resultTextView.text = message
            } else {
                resultTextView.text = "Invalid Input. Please enter a valid age between 20 and 100."
            }
        }
    }
}
// References:
// IIE 2024, Introduction to Mobile Application Development,Module Manual. The Independent institute of Education