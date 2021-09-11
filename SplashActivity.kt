package com.wintech.diydr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wintech.diydr.R
import android.content.Intent
import android.os.Handler
import com.wintech.diydr.MainActivity
import com.wintech.diydr.SplashActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({ startActivity(Intent(this@SplashActivity, MainActivity::class.java)) }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        private const val SPLASH_TIME_OUT = 2000
    }
}
