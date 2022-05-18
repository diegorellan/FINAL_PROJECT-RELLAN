package com.example.finalproject_rellan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ToursActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tours)

        val first_tour_button = findViewById<Button>(R.id.first_tour_button)
        first_tour_button.setOnClickListener {
            val intent_first_tour = Intent(this, FirstTourActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_first_tour)
        }

        val second_tour_button = findViewById<Button>(R.id.second_tour_button)
        second_tour_button.setOnClickListener {
            val intent_second_tour = Intent(this, SecondTourActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_second_tour)
        }

        val third_tour_button = findViewById<Button>(R.id.third_tour_button)
        third_tour_button.setOnClickListener {
            val intent_third_tour = Intent(this, ThirdTourActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_third_tour)
        }
    }
}