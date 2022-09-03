package com.example.androiddevelopment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val username=intent.getStringExtra("USER")
        val textView=findViewById<TextView>(R.id.textView)
        val message="$username, you will get free eccess to all the content for one month"
        textView.text=message
    }
}