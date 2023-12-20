package com.example.pr25fed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer

    lateinit var pudgebtn: ImageButton
    lateinit var barabtn: ImageButton
    lateinit var bhbtn: ImageButton
    lateinit var horsebtn: ImageButton
    lateinit var catbtn: ImageButton
    lateinit var kazahbtn: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pudgebtn = findViewById(R.id.pudge)
        barabtn = findViewById(R.id.bara)
        bhbtn = findViewById(R.id.bh)
        horsebtn = findViewById(R.id.horse)
        catbtn = findViewById(R.id.bara)
        kazahbtn = findViewById(R.id.kazah)

        barabtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.bara_sound)

            mediaPlayer.start()
        }

        pudgebtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.pudge)

            mediaPlayer.start()
        }

        bhbtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.bh)

            mediaPlayer.start()
        }

        horsebtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.horse)

            mediaPlayer.start()
        }

        catbtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.cat)

            mediaPlayer.start()
        }

        kazahbtn.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.kazah)

            mediaPlayer.start()
        }

    }
}