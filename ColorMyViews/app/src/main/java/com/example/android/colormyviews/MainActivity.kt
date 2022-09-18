package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constraintLayout: ConstraintLayout=findViewById(R.id.constraint_layout)
        constraintLayout.setBackgroundColor(Color.GRAY)
        setListeners()
    }

    private fun setListeners(){
        val box1: TextView=findViewById(R.id.box1)
        val box2: TextView=findViewById(R.id.box2)
        val box3: TextView=findViewById(R.id.box3)
        val box4: TextView=findViewById(R.id.box4)
        val box5: TextView=findViewById(R.id.box5)
        val button1: Button=findViewById(R.id.button1)
        val button2: Button=findViewById(R.id.button2)
        val button3: Button=findViewById(R.id.button3)
        val constraintLayout: ConstraintLayout=findViewById(R.id.constraint_layout)
        val clickableViews: List<View> = listOf(box1,box2, box3, box4, box5, constraintLayout, button1, button2, button3)
        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box1 -> view.setBackgroundColor(Color.BLUE)
            R.id.box2 -> view.setBackgroundColor(Color.RED)

            // Boxes using Android color resources for background
            R.id.box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button1 -> view.setBackgroundColor(Color.RED)
            R.id.button2 -> view.setBackgroundColor(Color.BLUE)
            R.id.button3 -> view.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.YELLOW)
        }
    }
}