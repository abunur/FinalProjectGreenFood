package com.example.finalgreenfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * @btn1 sends the user to the MainActivity2grow
         */
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2grow::class.java)
            startActivity(intent)
        }

        /**
         * @btn2 sends the user to the MainActivity3buy
         */
        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity3buy::class.java)
            startActivity(intent)
        }
    }
}