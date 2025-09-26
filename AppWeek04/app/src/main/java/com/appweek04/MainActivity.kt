package com.appweek04

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonGreet = findViewById<Button>(R.id.buttonGreet)
        val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)

        buttonGreet.setOnClickListener { //이벤트 리스너
            val name = editTextName.text.toString().trim()

            var greeting: String = ""

            if(name.isNotEmpty()){
                greeting = "안녕하세요, ${name}님!"
            }else{
                greeting = "이름을 입력해주세요"
            }
            textViewGreeting.text = greeting
            textViewGreeting.visibility = View.VISIBLE
            Log.d("KotlinWeek04App", greeting)
        }
    }
}