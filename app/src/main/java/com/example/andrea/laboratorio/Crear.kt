package com.example.andrea.laboratorio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Crear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

        val nombre: TextView = findViewById(R.id.nombre)
        val telefono: TextView = findViewById(R.id.telefono)
        val email : TextView = findViewById(R.id.email)
    }
}
