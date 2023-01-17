package com.example.tupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        btn_food.setOnClickListener()
        {
            val name = nameInput.text.toString()

            val fm = Intent(this,food::class.java)
            fm.putExtra("Name",name)
            startActivity(fm)
        }
        btn_drinks.setOnClickListener()
        {
            val name = nameInput.text.toString()

            val dm = Intent(this,drinks::class.java)
            dm.putExtra("Name",name)
            startActivity(dm)
        }
    }
}