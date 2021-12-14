package com.capstone.project.kotoba.ui.kategori.n4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.project.kotoba.databinding.ActivityKategoriN4Binding

class KategoriN4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKategoriN4Binding
    private val title = "Kategori N4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKategoriN4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[KategoriN4ViewModel::class.java]
        val kategori = viewModel.getKategoriN4()

        val kategoriN4Adapter = KategoriN4Adapter()
        kategoriN4Adapter.setKategori(kategori)

        binding.rvKategori.layoutManager = LinearLayoutManager(this@KategoriN4Activity)
        binding.rvKategori.setHasFixedSize(true)
        binding.rvKategori.adapter = kategoriN4Adapter
    }
}