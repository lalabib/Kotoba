package com.capstone.project.kotoba.ui.setting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.R

class SettingActivity : AppCompatActivity() {

    private val title = "Pengaturan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingFragment())
                .commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}