package com.brijwel.securingapikeyswithndk

object ApiKeys {
    init {
        System.loadLibrary("keys")
    }
     external fun getAPIKey(): String
}