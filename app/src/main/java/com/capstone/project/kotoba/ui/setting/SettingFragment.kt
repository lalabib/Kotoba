package com.capstone.project.kotoba.ui.setting

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.capstone.project.kotoba.R

class SettingFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting_preferences, rootKey)
    }
}