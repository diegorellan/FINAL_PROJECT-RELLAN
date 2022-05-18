package com.example.finalproject_rellan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView

class AccomodationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accomodation)

        //Here I initialise some variables for later computations
        var rating_num_sercotel=0
        var rating_sercotel=0.0
        val show_rating_sercotel=findViewById<TextView>(R.id.show_rating_sercotel)

        val sercotel_submit=findViewById<Button>(R.id.sercotel_submit)
        val sercotel_rating=findViewById<RatingBar>(R.id.sercotel_ratingbar)
        val sercotel_review=findViewById<EditText>(R.id.sercotel_edittext)

        show_rating_sercotel.text="Current user rating "+rating_sercotel.toString()+" stars"

        //The same but for another hotel
        var rating_num_lisboa=0
        var rating_lisboa=0.0
        val show_rating_lisboa=findViewById<TextView>(R.id.show_rating_lisboa)
        show_rating_lisboa.text="Current user rating "+rating_lisboa.toString()+" stars"

        val lisboa_submit=findViewById<Button>(R.id.lisboa_submit)
        val lisboa_rating=findViewById<RatingBar>(R.id.lisboa_ratingbar)
        val lisboa_review=findViewById<EditText>(R.id.lisboa_edittext)

        //The same but for another hotel
        var rating_num_ac=0
        var rating_ac=0.0
        val show_rating_ac=findViewById<TextView>(R.id.show_rating_ac)
        show_rating_ac.text="Current user rating "+rating_ac.toString()+" stars"

        val ac_submit=findViewById<Button>(R.id.ac_submit)
        val ac_rating=findViewById<RatingBar>(R.id.ac_ratingbar)
        val ac_review=findViewById<EditText>(R.id.ac_edittext)

        //Now I set an OnClickListener on the button and implement the rest

        sercotel_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num_sercotel=rating_num_sercotel+1
            rating_sercotel=((rating_sercotel + sercotel_rating.getRating())/(rating_num_sercotel))
            var review_sercotel=sercotel_review.getText().toString()
            //Now I print the new value
            show_rating_sercotel.text="Current user rating: "+rating_sercotel.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            sercotel_review.getText().clear()
            sercotel_rating.setRating(0.0F)
        }

        lisboa_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num_lisboa=rating_num_lisboa+1
            rating_lisboa=((rating_lisboa + lisboa_rating.getRating())/(rating_num_lisboa))
            var review_lisboa=lisboa_review.getText().toString()
            //Now I print the new value
            show_rating_lisboa.text="Current user rating: "+rating_lisboa.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            lisboa_review.getText().clear()
            lisboa_rating.setRating(0.0F)
        }

        ac_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num_ac=rating_num_ac+1
            rating_ac=((rating_ac + ac_rating.getRating())/(rating_num_ac))
            var review_ac=ac_review.getText().toString()
            //Now I print the new value
            show_rating_ac.text="Current user rating: "+rating_ac.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            ac_review.getText().clear()
            ac_rating.setRating(0.0F)
        }
    }
}