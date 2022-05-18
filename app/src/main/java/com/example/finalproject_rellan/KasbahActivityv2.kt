package com.example.finalproject_rellan

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class KasbahActivityv2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasbah_activityv2)
        //Here I initialise some variables for later computations
        var rating_num=0
        var rating=0.0
        val show_rating=findViewById<TextView>(R.id.show_rating)
        show_rating.text="Current user rating "+rating.toString()+" stars"

        //Here I am configuring the VideoView in order to be able to play the video
        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.kasbah_vid
        val videoView = findViewById <View>(R.id.kasbah_videoview) as VideoView
        videoView.setVideoURI(Uri.parse(filePlace))
        videoView.setMediaController(MediaController( this))
        videoView.start()

        //Now I need to configure the review functionality
        //First I will detect the submit button, the rating bar, and the review EditText
        val kasbah_submit=findViewById<Button>(R.id.kasbah_submit)
        val kasbah_rating=findViewById<RatingBar>(R.id.kasbah_ratingbar)
        val kasbah_review=findViewById<EditText>(R.id.kasbah_edittext)
        //Now I set an OnClickListener on the button and implement the rest
        kasbah_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num=rating_num+1
            rating=((rating + kasbah_rating.getRating())/(rating_num))
            var review=kasbah_review.getText().toString()
            //Now I print the new value
            show_rating.text="Current user rating: "+rating.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            kasbah_review.getText().clear()
            kasbah_rating.setRating(0.0F)
        }
        //Now I add the audio description functionality
        val kasbah_audio=findViewById<Button>(R.id.kasbah_audio)
        kasbah_audio.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(this, R.raw.kasbah_speech)
            mediaPlayer?.start()
        }

    }



}