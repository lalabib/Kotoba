package com.capstone.project.kotoba.ui.practice.n5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.databinding.ActivityPracticeN5Binding

class PracticeN5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPracticeN5Binding
    private val title = "Menghafal Kosakata N5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPracticeN5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title
    }
}