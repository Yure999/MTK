package com.example.mejoratukmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mejoratukmm.shared.Greeting
import android.widget.TextView
import com.example.mejoratukmm.shared.diceRoller.DiceRoller

class MainActivity : AppCompatActivity() {
    private val diceRoller = DiceRoller()
    private fun rollDice() {
        diceRoller.rollDice()
    }

    private fun setText(): String {
        return diceRoller.getDiceNumber().toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()
            tv.text = setText()
        }
    }
}
