package com.example.andrea.laboratorio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contactos.*

class Contactos : AppCompatActivity() {
    val contactos: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)

rlContacts. = ContactsAdapter(contactos, this)


    }
}
