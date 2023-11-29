package com.example.topgear_proyecto

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.RecogidaUsuario)
        button = findViewById(R.id.BotonIniciarSesion)

        val botonIniciarSesion = findViewById<Button>(R.id.BotonIniciarSesion)
        botonIniciarSesion.setOnClickListener {
            val nombreusuario = editText.text.toString()
            val intent = Intent(this,CreditActivity::class.java)
            intent.putExtra("nombre", nombreusuario)
            startActivity(intent)

        }


    }
}