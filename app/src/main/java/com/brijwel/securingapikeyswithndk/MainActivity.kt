package com.brijwel.securingapikeyswithndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.apiKey).text = """
            ${ApiKeys.getAPIKey()}
            ${ApiKeys.getAPIKeyByType(ApiKeys.AUTH)}
            ${ApiKeys.getAPIKeyByType(ApiKeys.CHAT)}
            ${ApiKeys.getAPIKeyByType(ApiKeys.BASE)}
            """.trimIndent()

        Log.d("APIKEY", ApiKeys.getAPIKey())
        Log.d("APIKEY", ApiKeys.getAPIKeyByType(ApiKeys.AUTH))
        Log.d("APIKEY", ApiKeys.getAPIKeyByType(ApiKeys.CHAT))
        Log.d("APIKEY", ApiKeys.getAPIKeyByType(ApiKeys.BASE))
    }
}