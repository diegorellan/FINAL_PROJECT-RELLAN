package com.example.finalproject_rellan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main_button = findViewById<Button>(R.id.main_button)
        main_button.setOnClickListener {
            val intent_main = Intent(this, OptionsActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_main)

        }
    }
}