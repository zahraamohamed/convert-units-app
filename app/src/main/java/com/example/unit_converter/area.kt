package com.example.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_converter.databinding.ActivityAreaBinding

class area : AppCompatActivity() {
    lateinit var binding: ActivityAreaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)


    binding.convert.setOnClickListener {
        convert()
    }
binding.reset.setOnClickListener { reset() }

}

    private fun reset() {
        binding.resault.text=""

    }

    private fun convert() {
        var inches: Double = binding.Input.text.toString().toDouble()
        inches *= 0.0254
        binding.resault.text = inches.toString()
    }

}