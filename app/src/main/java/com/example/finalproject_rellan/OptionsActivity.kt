package com.example.finalproject_rellan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        //Now I am going to detect each button and assign an intent to each of them to start another activity
        val events_button = findViewById<Button>(R.id.events_button)
        events_button.setOnClickListener {
            val intent_events = Intent(this, EventsActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_events)
        }

        val places_button = findViewById<Button>(R.id.places_button)
        places_button.setOnClickListener {
            val intent_places = Intent(this, PlacesActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_places)
        }

        val accomodation_button = findViewById<Button>(R.id.accomodation_button)
        accomodation_button.setOnClickListener {
            val intent_accomodation = Intent(this, AccomodationActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_accomodation)
        }

        val tours_button = findViewById<Button>(R.id.tours_button)
        tours_button.setOnClickListener {
            val intent_tours = Intent(this, ToursActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_tours)
        }
    }
}