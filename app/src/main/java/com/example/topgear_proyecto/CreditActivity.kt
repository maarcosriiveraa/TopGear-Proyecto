package com.example.topgear_proyecto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreditActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)
        textView = findViewById(R.id.TextViewUsuario)
        val nombreusuario = intent.getStringExtra("nombre")
        val mensajeusuario = getString(R.string.BienvenidaUsuario, nombreusuario)
        textView.text = mensajeusuario

        val botonContactar = findViewById<Button>(R.id.btnContactar)
        botonContactar.setOnClickListener {
            enviarCorreo()
        }

    }
    private fun enviarCorreo() {
        val email = "marcosriveraoreal@gmail.com"
        val nombreApp = getString(R.string.app_name)
        val asunto = "Consulta de la app $nombreApp"

        val Intentemail = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$email")
            putExtra(Intent.EXTRA_SUBJECT, asunto)
        }
        if (Intentemail.resolveActivity(packageManager) != null) {
            startActivity(Intentemail)
        }
    }
}