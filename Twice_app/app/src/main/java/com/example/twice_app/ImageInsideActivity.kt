package com.example.twice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image_inside.*
import kotlinx.android.synthetic.main.activity_main.*

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        // getStringExtra 를 이용하여 변수 "data" 에 담긴 값을 받는다.
        val getData = intent.getStringExtra("data")

        val memberImage = memberImage

        when(getData) {
            "1" -> memberImage.setImageResource(R.drawable.member_1)
            "2" -> memberImage.setImageResource(R.drawable.member_2)
            "3" -> memberImage.setImageResource(R.drawable.member_3)
            "4" -> memberImage.setImageResource(R.drawable.member_4)
            "5" -> memberImage.setImageResource(R.drawable.member_5)
            "6" -> memberImage.setImageResource(R.drawable.member_6)
            "7" -> memberImage.setImageResource(R.drawable.member_7)
            "8" -> memberImage.setImageResource(R.drawable.member_8)
            "9" -> memberImage.setImageResource(R.drawable.member_9)
            else -> println("error")
        }
    }
}