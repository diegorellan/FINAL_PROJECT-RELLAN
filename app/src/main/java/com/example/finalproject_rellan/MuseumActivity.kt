package com.example.finalproject_rellan

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MuseumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum)

        //Here I initialise some variables for later computations
        var rating_num=0
        var rating=0.0
        val show_rating=findViewById<TextView>(R.id.show_rating_museum)
        show_rating.text="Current user rating "+rating.toString()+" stars"

        //Here I am configuring the VideoView in order to be able to play the video
        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.museum_vid
        val videoView = findViewById <View>(R.id.museum_videoview) as VideoView
        videoView.setVideoURI(Uri.parse(filePlace))
        videoView.setMediaController(MediaController( this))
        videoView.start()

        //Now I need to configure the review functionality
        //First I will detect the submit button, the rating bar, and the review EditText
        val museum_submit=findViewById<Button>(R.id.museum_submit)
        val museum_rating=findViewById<RatingBar>(R.id.museum_ratingbar)
        val museum_review=findViewById<EditText>(R.id.museum_edittext)
        //Now I set an OnClickListener on the button and implement the rest
        museum_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num=rating_num+1
            rating=((rating + museum_rating.getRating())/(rating_num))
            var review=museum_review.getText().toString()
            //Now I print the new value
            show_rating.text="Current user rating: "+rating.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            museum_review.getText().clear()
            museum_rating.setRating(0.0F)
        }

        val museum_audio=findViewById<Button>(R.id.museum_audio_button)
        museum_audio.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(this, R.raw.museum_speech)
            mediaPlayer?.start()
        }
    }
}