package com.example.assignment3_part2

import User
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShoppingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_activity)
        val user = intent.getStringExtra("user")
        val greeting = findViewById<TextView>(R.id.Greeting)
        val image1 = findViewById<ImageView>(R.id.image1)
        val image2 = findViewById<ImageView>(R.id.image2)
        val image3 = findViewById<ImageView>(R.id.image3)
        val image4 = findViewById<ImageView>(R.id.image4)

        if (user != null) {
            greeting.text = "Hello "+ user
        }

        image1.setOnClickListener{
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }

        image2.setOnClickListener{
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }

        image3.setOnClickListener{
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }

        image4.setOnClickListener{
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }

        }
}