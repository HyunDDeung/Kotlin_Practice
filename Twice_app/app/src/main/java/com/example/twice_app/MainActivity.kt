package com.example.twice_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = member_1
        val btn2 = member_2
        val btn3 = member_3
        val btn4 = member_4
        val btn5= member_5
        val btn6 = member_6
        val btn7 = member_7
        val btn8 = member_8
        val btn9 = member_9

        btn1.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }
        btn8.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }
        btn9.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }
    }
}

