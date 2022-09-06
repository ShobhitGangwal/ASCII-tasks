package com.example.android.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.button1)
        val diceImage: ImageView=findViewById(R.id.diceImage)
        val textView: TextView=findViewById(R.id.textView)
        val textView2: TextView=findViewById(R.id.textView2)
        rollButton.setOnClickListener{
            val randNum=(1..6).random()
            val drawRes = when(randNum){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6
            }
            diceImage.setImageResource(drawRes)
            val text1="You Got: $randNum"
            textView2.text = text1
            textView.visibility = View.INVISIBLE
            textView2.visibility = View.VISIBLE
            diceImage.visibility = View.VISIBLE
        }
    }
}