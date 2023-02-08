package com.c1ph3rj.todoo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.c1ph3rj.todoo.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var bindView : ActivityMainBinding
    private var count = 0
    private lateinit var firebaseAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindView.root)

        init()
    }

    private fun init(){
        try {
            val nameField : EditText = bindView.nameField
            val loginBtn : Button = bindView.increaseCount
            val passwordField : EditText = bindView.passwordField

            firebaseAuth = FirebaseAuth.getInstance();
            
            basicFunctions()
        }catch (e:Exception){
            e.printStackTrace();
        }
    }


    private fun basicFunctions(){

    }
}