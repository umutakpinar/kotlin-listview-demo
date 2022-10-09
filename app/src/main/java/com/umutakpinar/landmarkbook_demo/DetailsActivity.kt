package com.umutakpinar.landmarkbook_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.umutakpinar.landmarkbook_demo.databinding.ActivityDetailsBinding
import com.umutakpinar.landmarkbook_demo.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)
    }
}