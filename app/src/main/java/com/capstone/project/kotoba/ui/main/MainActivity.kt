package com.capstone.project.kotoba.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.capstone.project.kotoba.R
import com.capstone.project.kotoba.databinding.ActivityMainBinding
import com.capstone.project.kotoba.ui.kategori.n4.KategoriN4Activity
import com.capstone.project.kotoba.ui.kategori.n5.KategoriN5Activity
import com.capstone.project.kotoba.ui.setting.SettingActivity

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
}