package com.umutakpinar.landmarkbook_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.umutakpinar.landmarkbook_demo.databinding.ActivityDetailsBinding
import com.umutakpinar.landmarkbook_demo.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    private lateinit var landmarks: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)

        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.tvLandmarkName.text = selectedLandmark.landmarkName
        binding.tvLandmarkCountry.text = selectedLandmark.landmarkCountry
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}