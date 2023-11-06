package com.example.assignment3_part2;

import User
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity: AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        val userName = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val firstName = findViewById<EditText>(R.id.first)
        val lastName = findViewById<EditText>(R.id.last)
        val createAccountButton = findViewById<Button>(R.id.create)
//        val extras = intent.extras

        createAccountButton.setOnClickListener {

            val user = User(
                firstName.text.toString(),
                lastName.text.toString(),
                userName.text.toString(),
                password.text.toString()
            )
            val userList = intent.getParcelableArrayListExtra<User>("userList", User::class.java)
            val user1 = userList?.get(0)
            userList?.add(user)
            val shoppingActivity = Intent(this, ShoppingActivity::class.java)
            shoppingActivity.putExtra("user", user.username)
            startActivity(shoppingActivity)
        }
    }
}
