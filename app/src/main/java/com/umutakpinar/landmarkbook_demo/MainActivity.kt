package com.umutakpinar.landmarkbook_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.umutakpinar.landmarkbook_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarks : ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)

        landmarks = ArrayList()
        addLandmarkList()
        val myListViewAdapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,landmarks.map { it -> it.landmarkName })
        binding.listView.adapter = myListViewAdapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            intent = Intent(this@MainActivity,DetailsActivity::class.java)
            intent.putExtra("landmark", landmarks[i])

            startActivity(intent)
        }

    }

    private fun addLandmarkList(){
        landmarks.add(Landmark("Colloseum","Italy",R.drawable.colloseum))
        landmarks.add(Landmark("Great Wall of China","China",R.drawable.greatwall))
        landmarks.add(Landmark("Pisa","UK",R.drawable.pisa))
    }
}

