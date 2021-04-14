package com.bignerdranch.android.aartest

import android.util.Log

class testaar(name: String, age: Int){
    val fname: String
    val age: Int

    init{
        fname = name
        this.age = age
        println("person is named" + fname + " age " + age);
        println("from aar")
    }

    fun testCall(){
        Log.d("aar" , "testCall")
    }
}