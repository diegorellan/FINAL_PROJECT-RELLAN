package com.example.finalproject_rellan

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class PalmasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palmas)

        //Here I initialise some variables for later computations
        var rating_num=0
        var rating=0.0
        val show_rating=findViewById<TextView>(R.id.show_rating_palmas)
        show_rating.text="Current user rating "+rating.toString()+" stars"

        //Here I am configuring the VideoView in order to be able to play the video
        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.palmas_vid
        val videoView = findViewById <View>(R.id.palmas_videoview) as VideoView
        videoView.setVideoURI(Uri.parse(filePlace))
        videoView.setMediaController(MediaController( this))
        videoView.start()

        //Now I need to configure the review functionality
        //First I will detect the submit button, the rating bar, and the review EditText
        val palmas_submit=findViewById<Button>(R.id.palmas_submit)
        val palmas_rating=findViewById<RatingBar>(R.id.palmas_ratingbar)
        val palmas_review=findViewById<EditText>(R.id.palmas_edittext)
        //Now I set an OnClickListener on the button and implement the rest
        palmas_submit.setOnClickListener {
            //I store the values of the rating and the review text
            rating_num=rating_num+1
            rating=((rating + palmas_rating.getRating())/(rating_num))
            var review=palmas_review.getText().toString()
            //Now I print the new value
            show_rating.text="Current user rating: "+rating.toString()+" stars"
            //Now I should clear the EditText and the RatingBar
            palmas_review.getText().clear()
            palmas_rating.setRating(0.0F)
        }

        //Now I add the audio description functionality
        val palmas_audio=findViewById<Button>(R.id.palmas_audio_button)
        palmas_audio.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(this, R.raw.palmas_speech)
            mediaPlayer?.start()
        }
    }
}