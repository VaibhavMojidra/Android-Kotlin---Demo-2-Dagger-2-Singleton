package com.vaibhavmojidra.androidkotlindemo2dagger2singleton

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlayGame @Inject constructor(smartPhone:SmartPhone,game:Game){

    init {
        Log.i("MyTag","PlayGame class initialized.")
        smartPhone.isSmartPhoneAvailable()
        game.isGameDownloaded()
    }

    fun playGame() {
        Log.i("MyTag","Starting game...")
    }

}