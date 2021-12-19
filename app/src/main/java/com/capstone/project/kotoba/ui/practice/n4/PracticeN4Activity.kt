package com.capstone.project.kotoba.ui.practice.n4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.databinding.ActivityPracticeN4Binding

class PracticeN4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPracticeN4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeN4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}