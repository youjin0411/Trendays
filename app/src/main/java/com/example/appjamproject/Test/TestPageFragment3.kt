package com.example.appjamproject.Test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import com.example.appjamproject.*

class TestPageFragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_page_fragment3, container, false)

        view.findViewById<Button>(R.id.previous_btn).setOnClickListener {
            fragmentManager
                ?.beginTransaction()
                ?.replace(R.id.test_fragment_container, TestPageFragment2())
                ?.commit()
        }

        val resultBtn = view.findViewById<Button>(R.id.result_btn)
        view.findViewById<RadioGroup>(R.id.radio_group4)
            .setOnCheckedChangeListener { group, checkedId ->
                when (checkedId) {
                    R.id.nono4 -> {
                        resultBtn.setOnClickListener {
                            val intent = Intent(context, BabyBoomResultActivity::class.java)
                            startActivity(intent)
                        }
                    }
                    R.id.no4 -> {
                        resultBtn.setOnClickListener {
                            val intent = Intent(context, XResultActivity::class.java)
                            startActivity(intent)
                        }
                    }
                    R.id.yes4 -> {
                        resultBtn.setOnClickListener {
                            val intent = Intent(context, MillenniumResultActivity::class.java)
                            startActivity(intent)
                        }
                    }
                    R.id.yesyes4 -> {
                        resultBtn.setOnClickListener {
                            val intent = Intent(context, ZResultActivity::class.java)
                            startActivity(intent)
                        }
                    }
                    else -> {
                        Log.d("mytag", "이걸 왜 눌러")
                    }
                }
            }


        return view
    }
}