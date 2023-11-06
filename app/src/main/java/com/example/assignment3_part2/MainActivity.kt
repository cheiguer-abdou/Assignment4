package com.example.assignment3_part2

import User
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signInButton = findViewById<Button>(R.id.create)
        val userName = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val createAccountButton = findViewById<Button>(R.id.buttonNewAccount)

        val user1 = User("John", "Doe", "johndoe@gmail.com", "123")
        val user2 = User("Jane", "Smith", "janesmith@gmail.com", "456")
        val user3 = User("Alice", "Johnson", "alicej@gmail.com", "789")
        val user4 = User("Bob", "Brown", "bobbrown@gmail.com", "101")
        val user5 = User("Ella", "Williams", "ellaw@gmail.com", "102")

        val userList = ArrayList<User>()
        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)

        createAccountButton.setOnClickListener{
            val register = Intent(this, RegisterActivity::class.java)
            register.putParcelableArrayListExtra("userList", userList)
            startActivity(register)
        }

        signInButton.setOnClickListener{
            val enteredUsername = userName.text.toString()
            val enteredPassword = password.text.toString()
            var currentUser:User? =  null

            for (user in userList) {
                if (user.username == enteredUsername && user.password == enteredPassword) {
                    currentUser = user

                    val shoppingActivity = Intent(this, ShoppingActivity::class.java)
                    shoppingActivity.putExtra("user", currentUser.username)
                    startActivity(shoppingActivity)
                    break
                }
            }

        }
    }


}