package com.example.bts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면 클릭을 입력받음
        val image1 = findViewById<ImageView>(R.id.bts_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.bts_2)
        image1.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.bts_3)
        image1.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.bts_4)
        image1.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.bts_5)
        image1.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.bts_6)
        image1.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.bts_7)
        image1.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }



    }


}