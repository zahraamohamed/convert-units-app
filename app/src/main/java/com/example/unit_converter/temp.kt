package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_converter.databinding.ActivityDataBinding
import com.example.unit_converter.databinding.ActivityTempBinding

class temp : AppCompatActivity() {
    lateinit var binding:ActivityTempBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTempBinding.inflate(layoutInflater)
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
        var cel:Double = binding.Input.text.toString().toDouble()
        cel *=   (cel * 9/5) + 32
        binding.resault.text = cel.toString()
    }}