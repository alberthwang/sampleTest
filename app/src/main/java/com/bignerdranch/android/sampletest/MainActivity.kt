package com.bignerdranch.android.sampletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.bignerdranch.android.aartest.testaar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intent = Intent("com.bignerdranch.android.aartest.MainActivity")
        //intent.setClassName(this, "com.bignerdranch.android.aartest.MainActivity")
        //startActivity(intent)
        val taar = testaar("albert" , 24)
        taar.testCall()



    }
}