package com.example.practica_cartas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var botonEmpezar: Button
    private lateinit var introducirNombre: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instancias()
        acciones()
    }

    private fun instancias() {
        this.botonEmpezar = findViewById(R.id.boton_empezar)
        this.introducirNombre = findViewById(R.id.introducir_nombre)
    }

    private fun acciones() {
        //botonEmpezar.setOnClickListener(this)

    }

    /*override fun onClick(p0: View?) {
        when(p0!!.id){

            R.id.boton_empezar-> {

                if(!introducirNombre.text.isEmpty()){
                    var accionEmpezar = Intent(applicationContext, Juego::class.java)
                    startActivity(accionEmpezar)
                }
                else{
                    Toast.makeText(applicationContext, "Por favor introduce el nombre",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }*/
}