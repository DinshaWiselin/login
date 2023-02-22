package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginbut=findViewById<Button>(R.id.button)
        var edituser=findViewById<EditText>(R.id.editTextTextEmailAddress)
        var editpass=findViewById<EditText>(R.id.editTextTextPassword)
    loginbut.setOnClickListener {
        if (edituser.text.isNullOrEmpty()||editpass.text.isNullOrEmpty()){
            Toast.makeText(this,"Enter Username and password",Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"${edituser.text} has been logged in!.",Toast.LENGTH_SHORT).show()
        }


    }
    }
}