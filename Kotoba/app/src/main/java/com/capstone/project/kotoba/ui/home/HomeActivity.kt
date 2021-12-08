package com.capstone.project.kotoba.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.project.kotoba.databinding.ActivityHomeBinding
import com.capstone.project.kotoba.ui.instruksi.InstruksiFragment
import com.capstone.project.kotoba.ui.main.MainActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

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
            val mOptionDialogFragment = InstruksiFragment()

            val mFragmentManager = supportFragmentManager
            mOptionDialogFragment.show(mFragmentManager, InstruksiFragment::class.java.simpleName)
        }
    }
}