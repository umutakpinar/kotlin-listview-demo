package com.umutakpinar.landmarkbook_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.umutakpinar.landmarkbook_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)
    }
}