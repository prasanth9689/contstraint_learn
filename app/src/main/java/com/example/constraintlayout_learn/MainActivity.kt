package com.example.constraintlayout_learn

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
            WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMenu(view: View) {
        Toast.makeText(this@MainActivity, "Its a toast!", Toast.LENGTH_SHORT).show()

        val intent = Intent(context, ProfileViewActivity::class.java)
        startActivity(intent);
    }
}