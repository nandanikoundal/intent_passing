package com.example.intentpassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName : EditText
    lateinit var etAge : EditText
    lateinit var etGender : EditText
    lateinit var etMail : EditText
    lateinit var etNumber : EditText
    lateinit var etSalary : EditText
    lateinit var etInfo : EditText


    lateinit var Register : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        etNumber = findViewById(R.id.etNumber)
        etSalary = findViewById(R.id.etSalary)
        etInfo = findViewById(R.id.etInfo)
        etMail = findViewById(R.id.etMail)
        Register = findViewById(R.id.Register)

        Register.setOnClickListener {
            System.out.println("REGISTER Clicked")

            var name = etName.text.toString().toDouble()
            var age = etAge.text.toString().toInt()
            var gender = etGender.text.toString().toCharArray()
            var email = etMail.text.toString()
            var number = etNumber.text.toString()
            var salary = etSalary.text.toString().toFloat()
            var info = etInfo.text.toString().toBoolean()


            var intent = Intent(this, MainActivity::class.java)

            intent.putExtra("name",name)
            intent.putExtra("age", age)
            intent.putExtra("gender", gender)
            intent.putExtra("email", email)
            intent.putExtra("number", number)
            intent.putExtra("salary", salary)
            intent.putExtra("info",info)
            startActivity(intent)
        }
    }
    }
