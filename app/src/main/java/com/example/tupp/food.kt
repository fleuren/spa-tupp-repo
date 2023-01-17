package com.example.tupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.food_layout.*
import android.view.WindowManager

class food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_layout)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val intent=getIntent()
        val name = intent.getStringExtra("Name")
        nameOutputFM.text="Hello ! "+name

        btn_randomFM.setOnClickListener()
        {
            val rand = (1..3).random()
            if (rand == 1)
            {
                val menuFood1 = Intent(this, foodrecipe1::class.java)
                startActivity(menuFood1)
            }
            else if (rand == 2)
            {
                val menuFood2 = Intent(this, foodrecipe2::class.java)
                startActivity(menuFood2)
            }
            else
            {
                val menuFood3 = Intent(this, foodrecipe3::class.java)
                startActivity(menuFood3)
            }
        }
        btn_backFM.setOnClickListener()
        {
            val menuFM = Intent(this, MainActivity::class.java)
            startActivity(menuFM)
        }
        foodItem1.setOnClickListener()
        {
            val menuFood1 = Intent(this, foodrecipe1::class.java)
            startActivity(menuFood1)
        }
        foodItem2.setOnClickListener()
        {
            val menuFood2 = Intent(this, foodrecipe2::class.java)
            startActivity(menuFood2)
        }
        foodItem3.setOnClickListener()
        {
            val menuFood3 = Intent(this, foodrecipe3::class.java)
            startActivity(menuFood3)
        }
    }
}