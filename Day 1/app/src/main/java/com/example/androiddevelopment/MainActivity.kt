package com.example.androiddevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView=findViewById<TextView>(R.id.hello)
        val inputField=findViewById<EditText>(R.id.name)
        val submitButton: Button =findViewById<Button>(R.id.button)
        val offerbutton= findViewById<Button>(R.id.Btnoffers)
        var enteredName=""
        submitButton.setOnClickListener{
             enteredName=inputField.text.toString()

            if (enteredName==""){
                offerbutton.visibility= INVISIBLE
                greetingTextView.text=""
                Toast.makeText(this@MainActivity,"please enter your name!",Toast.LENGTH_SHORT).show()

            }
            else{
            val message = "welcome $enteredName"
            greetingTextView.text=message
            inputField.text.clear()
                offerbutton.visibility=VISIBLE
            }
        offerbutton.setOnClickListener{
            val intent=Intent(this,secondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
        }

    }
}