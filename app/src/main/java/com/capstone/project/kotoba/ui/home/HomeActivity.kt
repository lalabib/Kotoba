package com.capstone.project.kotoba.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager
import com.capstone.project.kotoba.R
import com.capstone.project.kotoba.databinding.ActivityHomeBinding
import com.capstone.project.kotoba.ui.instruksi.InstruksiFragment
import com.capstone.project.kotoba.ui.main.MainActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private var doubleBackToExitPressedOnce: Boolean = false
    private val pressed:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnMulai.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnInstruksi.setOnClickListener {
            val mInstruksiFragment = InstruksiFragment()

            val mFragmentManager = supportFragmentManager
            mInstruksiFragment.show(mFragmentManager, InstruksiFragment::class.java.simpleName)
        }
        setTheme()
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            finish()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, R.string.keluar, Toast.LENGTH_SHORT).show()
        Handler(Looper.getMainLooper()).postDelayed({
            doubleBackToExitPressedOnce = false
        }, pressed)
    }
    private fun setTheme() {
        val preference = PreferenceManager.getDefaultSharedPreferences(this)
        val darkMode = preference.getBoolean(getString(R.string.pref_dark_mode_key), false)
        if (darkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}