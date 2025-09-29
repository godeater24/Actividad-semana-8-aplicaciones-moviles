package com.example.actividadsemana8

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener { finish() }
    }
}
