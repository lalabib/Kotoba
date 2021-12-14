package com.capstone.project.kotoba.ui.kategori.n5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.project.kotoba.databinding.ActivityKategoriN5Binding

class KategoriN5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKategoriN5Binding
    private val title = "Kategori N5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKategoriN5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[KategoriN5ViewModel::class.java]
        val kategori = viewModel.getKategori()

        val kategoriN5Adapter = KategoriN5Adapter()
        kategoriN5Adapter.setKategori(kategori)

        binding.apply {
            rvKategori.layoutManager = LinearLayoutManager(this@KategoriN5Activity)
            rvKategori.setHasFixedSize(true)
            rvKategori.adapter = kategoriN5Adapter
        }
    }
}