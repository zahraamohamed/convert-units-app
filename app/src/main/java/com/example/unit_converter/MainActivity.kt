package com.example.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        onCall()
    }
    private fun onCall(){
        tempOpen()
        dataOpen()
        areaOpen()

    }

    private fun areaOpen() {
        binding.area.setOnClickListener {
            val intent = Intent(this,area::class.java)
            startActivity(intent)
        }
    }

    private fun dataOpen() {
        binding.data.setOnClickListener {
            val intent = Intent(this,data::class.java)
            startActivity(intent)
        }
    }

    // temperature  page
    private  fun tempOpen(){
        binding.temp.setOnClickListener {
            val intent = Intent(this,temp::class.java)
            startActivity(intent)
        }
    }
}
