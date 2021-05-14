package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_converter.databinding.ActivityDataBinding
import com.example.unit_converter.databinding.ActivityTempBinding

class temp : AppCompatActivity(),Parent {
    lateinit var binding:ActivityTempBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTempBinding.inflate(layoutInflater)
        setContentView(binding.root)
      onCall()
    }
   override fun onCall(){
        binding.convert.setOnClickListener { convert() }
        binding.reset.setOnClickListener { reset() }

    }

    override fun reset() {
        binding.resault.text=""

    }

    override fun convert() {
        var cel:Double = binding.Input.text.toString().toDouble()
        cel *=   (cel * 9/5) + 32
        binding.resault.text = cel.toString()
    }}