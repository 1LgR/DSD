package com.example.myapplication

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setIconAttribute(android.R.attr.alertDialogIcon)
                .setTitle("Menu ainda nao adicionado")
                .setMessage("Ainda sera implementado")
                .setPositiveButton("Fechar aviso") { dialogInterface, i -> // set what would happen when positive button is clicked
                    Toast.makeText(applicationContext, "Vai ser adicionado", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}


