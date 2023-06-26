package com.vaibhavmojidra.androidkotlindemo2dagger2singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MyTag","-----------")
        (application as PlayGameApplication).playGameComponent.getPlayGame().playGame()
    }
}