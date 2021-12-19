package com.capstone.project.kotoba.ui.kategori.n4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.project.kotoba.R
import com.capstone.project.kotoba.data.n4.KategoriN4
import com.capstone.project.kotoba.databinding.ActivityKategoriN4Binding
import com.capstone.project.kotoba.ui.practice.n4.PracticeN4Activity
import com.capstone.project.kotoba.ui.setting.SettingActivity

class KategoriN4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKategoriN4Binding
    private val title = "Kategori N4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKategoriN4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[KategoriN4ViewModel::class.java]
        val kategori = viewModel.getKategoriN4()

        val kategoriN4Adapter = KategoriN4Adapter()
        kategoriN4Adapter.setKategori(kategori)

        binding.rvKategori.layoutManager = LinearLayoutManager(this@KategoriN4Activity)
        binding.rvKategori.setHasFixedSize(true)
        binding.rvKategori.adapter = kategoriN4Adapter

        kategoriN4Adapter.setOnItemClickCallback(object : KategoriN4Adapter.OnItemClickCallback{
            override fun onItemClicked(data: KategoriN4) {
                val practice = Intent(this@KategoriN4Activity, PracticeN4Activity::class.java)
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