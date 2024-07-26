package com.example.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {



    private val dices = listOf(
        R.drawable.empty_dice,
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )

    private val numberOfDiceSides = 6

    private val _pickedDice = MutableLiveData<Int>()
    val pickedDice: LiveData<Int>
        get() = _pickedDice


    fun rollDice(){
        val dice = Dice(numberOfDiceSides)
        val nums = dice.roll()

        _pickedDice.postValue(dices[nums])
    }

}