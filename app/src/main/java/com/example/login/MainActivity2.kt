package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val nombreUsuario = intent.getStringExtra("usuario")

        val textView = findViewById<TextView>(R.id.usuario)
        textView.text = "Bienvenido $nombreUsuario"
    }
}
