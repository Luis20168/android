package com.example.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var enviar: Button
    lateinit var usuario: String
    lateinit var contraseña: String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EditTextUsuario: EditText = findViewById(R.id.usuario)
        val EditTextContraseña: EditText = findViewById(R.id.contraseña)
        enviar = findViewById(R.id.enviar)

        enviar.setOnClickListener {
            usuario = EditTextUsuario.text.toString()
            contraseña = EditTextContraseña.text.toString()

            if (usuario == "luis" && contraseña == "luis") {
                val intent = Intent(this, MainActivity2::class.java)
                val mensaje = "Bienvenido $usuario"
                Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()
                intent.putExtra("usuario",usuario)
                startActivity(intent)
            }
        }



    }
}


