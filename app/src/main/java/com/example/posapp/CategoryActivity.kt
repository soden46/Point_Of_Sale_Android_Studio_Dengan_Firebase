package com.example.posapp

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val btn1 = findViewById<Button>(R.id.dti3)
        val btn2 = findViewById<Button>(R.id.dti9)
        val btn3 = findViewById<Button>(R.id.dti5)
        val btn4 = findViewById<Button>(R.id.dti7)

        btn1.setOnClickListener {

            startActivity(Intent(this, i3_product::class.java))
        }
        btn2.setOnClickListener {

            startActivity(Intent(this, i9_product::class.java))
        }
        btn3.setOnClickListener {

            startActivity(Intent(this, i5_product::class.java))
        }
        btn4.setOnClickListener {

            startActivity(Intent(this, i7_product::class.java))
        }
    }
}
