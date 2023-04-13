package com.example.mytest2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalc: Button
    lateinit var btnWeb: Button
    lateinit var btnContact: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalc= findViewById(R.id.mSimpleCalc)
        btnWeb = findViewById(R.id.mWeb)
        btnContact = findViewById(R.id.mContactList)

        btnCalc.setOnClickListener {
            val  calc = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(calc)
        }
        btnWeb.setOnClickListener {
            val web = Intent(this@MainActivity, WebsiteActivity::class.java )
            startActivity(web)
        }
        btnContact.setOnClickListener {
            val contact = Intent(this@MainActivity, ContactActivity::class.java)
            startActivity(contact)
            }
        }
    }
