package com.example.switchbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.switchbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setCheckedChangeListener()
        //setContentView(R.layout.activity_main)
    }

    private fun setCheckedChangeListener() {
        binding.switchID.setOnCheckedChangeListener { _, isChecked ->
            val msg = getString(if (isChecked) R.string.on else R.string.off)
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
            binding.switchID.text = msg
        }

    }
}