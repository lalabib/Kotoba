package com.capstone.project.kotoba.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.databinding.ActivityMainBinding
import com.capstone.project.kotoba.ui.kategori.n4.KategoriN4Activity
import com.capstone.project.kotoba.ui.kategori.n5.KategoriN5Activity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnN5.setOnClickListener {
            val intent = Intent(this, KategoriN5Activity::class.java)
            startActivity(intent)
        }
        binding.btnN4.setOnClickListener {
            val intent = Intent(this, KategoriN4Activity::class.java)
            startActivity(intent)
        }
    }
}