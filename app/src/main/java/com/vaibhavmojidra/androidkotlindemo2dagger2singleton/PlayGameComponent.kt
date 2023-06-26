package com.vaibhavmojidra.androidkotlindemo2dagger2singleton

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface PlayGameComponent {
    fun getPlayGame():PlayGame
}