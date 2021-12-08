package com.capstone.project.kotoba.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}