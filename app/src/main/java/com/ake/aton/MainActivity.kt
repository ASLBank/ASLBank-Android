package com.ake.aton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_Aton.setOnClickListener {

            val intent:Intent = Intent( this, Puerta::class.java)
            startActivity(intent)
            //finish()
        }
    }
}
