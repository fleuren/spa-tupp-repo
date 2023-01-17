package com.example.tupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.drinks_layout.*
import android.view.WindowManager
import kotlinx.android.synthetic.main.food_layout.*


class drinks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drinks_layout)

        val intent=getIntent()
        val name = intent.getStringExtra("Name")
        nameOutputDM.text="Hello ! "+name


        btn_randomDM.setOnClickListener()
        {
            val rand = (1..3).random()
            if (rand == 1)
            {
                val menuDrink1 = Intent(this, drinksrecipe1::class.java)
                startActivity(menuDrink1)
            }
            else if (rand == 2)
            {
                val menuDrink2 = Intent(this, drinksrecipe2::class.java)
                startActivity(menuDrink2)
            }
            else
            {
                val menuDrink3 = Intent(this, drinksrecipe3::class.java)
                startActivity(menuDrink3)
            }
        }
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        btn_backDM.setOnClickListener()
        {
            val menuDM = Intent(this, MainActivity::class.java)
            startActivity(menuDM)
        }
        drinkItem1.setOnClickListener()
        {
            val menuDrink1 = Intent(this, drinksrecipe1::class.java)
            startActivity(menuDrink1)
        }
        drinkItem2.setOnClickListener()
        {
            val menuDrink2 = Intent(this, drinksrecipe2::class.java)
            startActivity(menuDrink2)
        }
        drinkItem3.setOnClickListener()
        {
            val menuDrink3 = Intent(this, drinksrecipe3::class.java)
            startActivity(menuDrink3)
        }
    }
}