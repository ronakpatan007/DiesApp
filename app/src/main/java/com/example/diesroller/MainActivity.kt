package com.example.diesroller

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    //    val textView = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rool_button)
        rollButton.setOnClickListener {
            rollDice()
        }

//        val textView = findViewById<View>(R.id.tvDisplay) as TextView
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        Log.i(TAG, "This is")

        val textView = findViewById<View>(R.id.tvDisplay) as TextView
        val diceImage: ImageView = findViewById(R.id.imgDispay)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        textView.text = randomInt.toString()
    }
}
