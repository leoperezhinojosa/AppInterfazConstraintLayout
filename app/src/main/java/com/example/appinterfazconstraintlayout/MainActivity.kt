package com.example.appinterfazconstraintlayout

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.appinterfazconstraintlayout.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)


        // 1 - Botón Llamada
        val button1Call = findViewById<Button>(id.button1call)

        button1Call.setOnClickListener {
            val phone = "tel:+34112"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(phone))
            startActivity(intent)
        }

        // 2 - Botón Web:
        val button3web = findViewById<Button>(id.button2search)

        button3web.setOnClickListener {
            val url = "https://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // 3 - Botón Alarma:
        val button2alarm = findViewById<Button>(id.button3alarm)

        button2alarm.setOnClickListener {
            val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            val intent = Intent(this, AlarmReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(this, 0, intent,
                PendingIntent.FLAG_IMMUTABLE)

            val time = System.currentTimeMillis() + 2 * 60 * 1000
            alarmManager.set(AlarmManager.RTC_WAKEUP, time, pendingIntent)
        }

        // 4 - Cámara:
        val button4Camera = findViewById<Button>(id.button4camera)

        button4Camera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        // 6 - LLamada de emergencias (automática)

        // Asociar un click listener al botón
//        .setOnClickListener {
//            // Iniciar la nueva Activity para realizar la llamada
//            val intent = Intent(this, MakeCallActivity::class.java)
//            startActivity(intent)
//        }


    }

    class AlarmReceiver: BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            return println("Alarma configurada")
        }
    }

}