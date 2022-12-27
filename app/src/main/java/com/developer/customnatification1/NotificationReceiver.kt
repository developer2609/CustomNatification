package com.developer.customnatification1

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.widget.Toast
import androidx.core.app.NotificationManagerCompat

class NotificationReceiver:BroadcastReceiver() {
var mediaPlayer:MediaPlayer?=null
    @SuppressLint("SuspiciousIndentation")
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()

   val notificationManager=NotificationManagerCompat.from(context!!)
          notificationManager.cancel(1)
    }
    object MyMedia{
        var mediaPlayer:MediaPlayer?=null
    }
}