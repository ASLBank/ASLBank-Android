package com.ake.aton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_puerta.*

class Puerta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puerta)

        button_Ingresar.setOnClickListener {

            val intent:Intent = Intent( this, Login::class.java)
            startActivity(intent)
        }

        button_Registrar.setOnClickListener {

            val intent:Intent = Intent( this, com.ake.aton.Registrar::class.java)
            startActivity(intent)
        }
    }
}
