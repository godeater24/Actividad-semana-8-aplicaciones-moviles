package com.example.actividadsemana8

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout = findViewById<Button>(R.id.btnAbout)
        val btnContact = findViewById<Button>(R.id.btnContact)

        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        btnContact.setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
        }
    }
}
