package com.bignerdranch.android.aartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var aarTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aarTextView = findViewById(R.id.aar_test)

        aarTextView.setOnClickListener{view: View ->
            getTestValue()

        }
    }

    private fun testPrint(){
        Log.d("AAR", "testprintcalled")
    }

    private fun getTestValue(){
        val test = "I am from AAR!"


        var toast = Toast.makeText(this, test, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP , 0, 0)
        toast.show()

        
    }

}