package com.example.mytest2

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var mWebb:WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        mWebb = findViewById(R.id.mWebb)
        val webSettings = mWebb.settings
        webSettings.javaScriptEnabled = true
        mWebb.loadUrl("https://www.google.com/")
    }
}