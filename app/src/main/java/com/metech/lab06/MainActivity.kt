package com.metech.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.metech.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.info.text = "Info???"

        binding.courses.setOnClickListener {
            binding.info.text = "Android Application Development, Android Security"
        }

        binding.exam.setOnClickListener {
            binding.info.text = "Exam susah"
        }

        binding.freelance.setOnClickListener {
            binding.info.text = "Kaya kaya kaya"
        }


    }
}