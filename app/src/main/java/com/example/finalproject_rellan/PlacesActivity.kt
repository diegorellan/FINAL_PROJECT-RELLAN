package com.example.finalproject_rellan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlacesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)

        val kasbah_button = findViewById<Button>(R.id.kasbah_button)
        kasbah_button.setOnClickListener {
            val intent_kasbah = Intent(this, KasbahActivityv2::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_kasbah)
        }

        val palmas_button = findViewById<Button>(R.id.palmas_button)
        palmas_button.setOnClickListener {
            val intent_palmas = Intent(this, PalmasActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_palmas)
        }

        val plaza_button = findViewById<Button>(R.id.plaza_button)
        plaza_button.setOnClickListener {
            val intent_plaza = Intent(this, PlazaActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_plaza)
        }

        val museum_button = findViewById<Button>(R.id.museum_button)
        museum_button.setOnClickListener {
            val intent_museum = Intent(this, MuseumActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_museum)
        }

        val river_button = findViewById<Button>(R.id.river_button)
        river_button.setOnClickListener {
            val intent_river = Intent(this, RiverActivity::class.java).apply {
                putExtra("lang", 1)
            }
            startActivity(intent_river)
        }
    }
}