package com.example.pratical1wed2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random;
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { count()}
    }

    private fun rollDice(){
        Toast.makeText(this, "Dice Rolled",
           Toast.LENGTH_SHORT).show()

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        val resultText4: TextView = findViewById(R.id.result_text4)
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()
        resultText4.text = ""
    }


    private fun count(){

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        val resultText4: TextView = findViewById(R.id.result_text4)

        try {
            resultText4.text = (resultText1.text.toString().toInt() + resultText2.text.toString().toInt() + resultText3.text.toString().toInt()).toString()
            Toast.makeText(this, "Dices Total Value Counted",
                Toast.LENGTH_SHORT).show()
        }catch(e: Exception){
            Toast.makeText(this, "Roll Dice First",
                Toast.LENGTH_SHORT).show()
        }

    }
}
