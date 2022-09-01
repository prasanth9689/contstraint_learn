package com.example.constraintlayout_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
            WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}