package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener { countUp() }
    }

    private fun rollDice(){
        //Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val rollText: TextView = findViewById(R.id.roll_text)
        //rollText.text = "Dice Rolled!"
        rollText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.roll_text)
        if (resultText.text == "Hello World!"){
            resultText.text = 1.toString()
        } else if(resultText.text == 6.toString()){
            Toast.makeText(this, "Final Count Reached", Toast.LENGTH_LONG).show()
        } else {
            val resultInt = resultText.text.toString().toInt() + 1
            resultText.text = resultInt.toString()
        }
    }
}