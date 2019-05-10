package com.example.changebg

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var

        buttonRed.setOnClickListener{
            screen.setBackgroundColor(Color.RED)
        }
        buttonBlue.setOnClickListener{
            screen.setBackgroundColor(Color.CYAN)
        }
    }
}
