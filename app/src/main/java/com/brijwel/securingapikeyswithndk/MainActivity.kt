package com.brijwel.securingapikeyswithndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("keys")
    }

    private external fun getAPIKey(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.apiKey).text = getAPIKey()
        Log.d("APIKEY", getAPIKey())
    }
}