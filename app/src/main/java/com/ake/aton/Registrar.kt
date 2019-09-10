package com.ake.aton

import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Registrar : AppCompatActivity() {

    private lateinit var txt_Name:EditText
    private lateinit var txt_LastName:EditText
    private lateinit var txt_Email:EditText
    private lateinit var txt_Password:EditText
    private lateinit var progressBar: ProgressBar
    private lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        txt_Name=findViewById(R.id.txt_Name)
        txt_LastName=findViewById(R.id.txt_LastName)
        txt_Email=findViewById(R.id.txt_Email)
        txt_Password=findViewById(R.id.txt_Password)

        progressBar= ProgressBar(this)
        auth= FirebaseAuth.getInstance()







    }
}
