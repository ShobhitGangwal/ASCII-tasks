package com.example.android.aboutmeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.aboutmeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        val button: Button = findViewById(R.id.button1)
//        button.setOnClickListener{
//            addName(it)
//        }

        binding.button1.setOnClickListener {
            addName(it)
        }
    }

    private fun addName(view: View){
//        val editText: EditText = findViewById(R.id.editText1)
//        val textView: TextView = findViewById(R.id.textView3)
//
//        textView.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        textView.visibility = View.VISIBLE

//        **Using binding**

//        binding.textView3.text = binding.editText1.text
//        binding.editText1.visibility = View.GONE
//        binding.button1.visibility = View.GONE
//        binding.textView3.visibility = View.VISIBLE

        binding.apply {
            textView3.text = editText1.text
            invalidateAll()
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            textView3.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}