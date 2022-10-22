package com.example.appjamproject.Test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appjamproject.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.test_fragment_container, TestPageFragment1())
            .commit()
    }
}