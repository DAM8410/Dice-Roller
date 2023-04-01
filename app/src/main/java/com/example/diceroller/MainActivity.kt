package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * The main activity class lets the user click a roll button and sets the onclicklistener to run the
 * rollDice function which creates an object of the Dice class and prints the resulting returned value
 * value to the textView
 */
class MainActivity : AppCompatActivity() {
    val mydice = Dice(numSides = 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = mydice.roll().toString()
        }

    }
}

/**
 * when this class is called it cretaes a random number on a 6 sided dice and returns the random number
 * to print out tho the screen using the textView
 */

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}