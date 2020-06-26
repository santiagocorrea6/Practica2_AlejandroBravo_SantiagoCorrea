package com.example.sesion2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // RECIBE EL CORREO Y LA CONTRASEÑA
        val email = intent.getStringExtra("correo")
        val password = intent.getStringExtra("pass")

        // IMPRIME EL CORREO Y LA CONTRASEÑA
        tv_email.text = "$email"
        tv_pass2.text = "$password"
    }

    //SETEAR EL MENU OVERFLOW
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    //ITEMS DEL MENU OVERFLOW - CERRAR SESION
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // CERRAR SESION
        if (item.itemId == R.id.menu_actividad) {
            // ENVIAN INFORMACION AL LOGIN
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("correo", tv_email.text.toString())
            intent.putExtra("pass", tv_pass2.text.toString())
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}

