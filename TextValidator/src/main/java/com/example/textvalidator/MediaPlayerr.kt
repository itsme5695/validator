package com.example.textvalidator

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast
import java.net.URI

object MediaPlayerr:MediaPlayer.OnPreparedListener {
    private var mediaPlayer: MediaPlayer?=null


    fun playMusic(context: Context, url:String){
            mediaPlayer = MediaPlayer()
            mediaPlayer?.setDataSource(url)
            mediaPlayer?.setOnPreparedListener(this)
            mediaPlayer?.prepareAsync()

    }
    override fun onPrepared(p0: MediaPlayer?) {
        mediaPlayer?.start()
    }

}