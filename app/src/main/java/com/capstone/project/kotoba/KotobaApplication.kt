package com.capstone.project.kotoba

import android.app.Application
import com.capstone.project.kotoba.util.createNotificationChannel

class KotobaApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel(this)
    }
}