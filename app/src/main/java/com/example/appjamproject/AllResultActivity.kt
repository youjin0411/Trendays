package com.example.appjamproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class AllResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_result)

        // 상단 액션바 숨기기
        supportActionBar?.hide()

        val babyboomCard = findViewById<CardView>(R.id.babyboom_card)
        val xCard = findViewById<CardView>(R.id.x_card)
        val millenniumCard = findViewById<CardView>(R.id.millennium_card)
        val zCard = findViewById<CardView>(R.id.z_card)

        // 각 카드뷰
        babyboomCard.setOnClickListener{
            val intent = Intent(this, BabyBoomResultActivity::class.java)
            startActivity(intent)
        }

        xCard.setOnClickListener {
            val intent = Intent(this, XResultActivity::class.java)
            startActivity(intent)
        }

        millenniumCard.setOnClickListener {
            val intent = Intent(this, MillenniumResultActivity::class.java)
            startActivity(intent)
        }

        zCard.setOnClickListener {
            val intent = Intent(this, ZResultActivity::class.java)
            startActivity(intent)
        }
    }
}