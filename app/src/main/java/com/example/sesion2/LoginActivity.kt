package com.example.sesion2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var datosRecbidos = intent.extras
        /*var nombre = datosRecbidos?.getString("nombre")
        var cedula = datosRecbidos?.getLong("cedula")

        Toast.makeText(this,"Nombre: $nombre y Cedula: $cedula", Toast.LENGTH_SHORT).show()*/

        button.setOnClickListener {
            //onBackPressed()
            val intent: Intent = Intent(this, RegistroActivity::class.java)
            startActivityForResult(intent, 1234)
        }

        button3.setOnClickListener {
            val intent: Intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            val nombre = data?.extras?.getString("nombre")
            val cedula = data?.extras?.getLong("cedula")

            Toast.makeText(this, "nombre: $nombre, cedula $cedula", Toast.LENGTH_SHORT).show()
        }
    }
}