package com.example.appjamproject.Test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.appjamproject.R

class TestPageFragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_page_fragment1, container, false)

        view.findViewById<Button>(R.id.next_btn).setOnClickListener {
            fragmentManager
                ?.beginTransaction()
                ?.replace(R.id.test_fragment_container, TestPageFragment2())
                ?.commit()

        }

        return view
    }
}