package com.capstone.project.kotoba.ui.kategori.n5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.project.kotoba.R
import com.capstone.project.kotoba.data.n5.KategoriN5
import com.capstone.project.kotoba.databinding.ActivityKategoriN5Binding
import com.capstone.project.kotoba.ui.practice.n5.PracticeN5Activity
import com.capstone.project.kotoba.ui.setting.SettingActivity

class KategoriN5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKategoriN5Binding
    private val title = "Kategori N5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKategoriN5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[KategoriN5ViewModel::class.java]
        val kategori = viewModel.getKategori()

        val kategoriN5Adapter = KategoriN5Adapter()
        kategoriN5Adapter.setKategori(kategori)

        binding.apply {
            rvKategori.layoutManager = LinearLayoutManager(this@KategoriN5Activity)
            rvKategori.setHasFixedSize(true)
            rvKategori.adapter = kategoriN5Adapter
        }

        kategoriN5Adapter.setOnItemClickCallback(object : KategoriN5Adapter.OnItemClickCallback{
            override fun onItemClicked(data: KategoriN5) {
                val practice = Intent(this@KategoriN5Activity, PracticeN5Activity::class.java)
                practice.putExtra("uuid", data.id)
                startActivity(practice)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_list, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, SettingActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}