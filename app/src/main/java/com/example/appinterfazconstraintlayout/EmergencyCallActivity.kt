package com.example.appinterfazconstraintlayout

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class EmergencyCallActivity : AppCompatActivity() {

    private val REQUEST_CALL_PHONE_PERMISSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // Nº de teléfono para realizar la llamada directa:
//        val numberPhone = "112"
//
//        val intent : Intent(Intent.ACTION_CALL)
//
//        intent.data = Uri.parse("tel:$numberPhone")
//
//        // Verificación de permiso
//        if (ContextCompat.checkSelfPermission(
//                this,
//                Manifest.permission.CALL_PHONE
//            ) == PackageManager.PERMISSION_GRANTED
//        ) {
//            startActivity(intent)
//        } else {
//            // Solicitar permiso CALL_PHONE si no se tiene
//            ActivityCompat.requestPermissions(
//                this,
//                arrayOf(Manifest.permission.CALL_PHONE),
//                REQUEST_CALL_PHONE_PERMISSION
//            )
//        }


    }
}