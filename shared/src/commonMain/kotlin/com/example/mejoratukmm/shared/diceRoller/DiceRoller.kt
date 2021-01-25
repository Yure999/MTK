package com.example.mejoratukmm.shared.diceRoller

import kotlin.random.Random

class DiceRoller {
    var dice: Dice = Dice(diceNumber = 1)

    fun rollDice() {
        dice.diceNumber = Random.nextInt(1,7)
    }

    fun setDiceNumber(diceNumber: Int) {
        dice.diceNumber = diceNumber
    }

    fun getDiceNumber(): Int {
        return dice.diceNumber
    }
}