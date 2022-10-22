package com.example.app_jamproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.appjamproject.AllResultActivity
import com.example.appjamproject.R
import com.example.appjamproject.Test.TestStartActivity
import com.example.appjamproject.ZResultActivity

class MyPageFragment : Fragment() {
    private lateinit var image_view: ImageView
    val OPEN_CALLERY = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.my_page_fragment,container,false)

        val myBtn = view.findViewById<Button>(R.id.btn_mytest)
        val allTestBtn = view.findViewById<Button>(R.id.btn_alltest)

        myBtn.setOnClickListener {
            val intent = Intent(context, ZResultActivity::class.java)
            startActivity(intent)
        }

        allTestBtn.setOnClickListener {
            val intent = Intent(context, AllResultActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}