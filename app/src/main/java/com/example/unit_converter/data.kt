package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_converter.databinding.ActivityDataBinding

class data : AppCompatActivity() {
    lateinit var binding: ActivityDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBinding.inflate(layoutInflater)
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
        var bits:Int = binding.Input.text.toString().toInt()
        bits *= 8
        binding.resault.text = bits.toString()
    }

}