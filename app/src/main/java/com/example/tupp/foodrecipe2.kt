package com.example.tupp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import kotlinx.android.synthetic.main.activity_drinksrecipe1.*
import kotlinx.android.synthetic.main.activity_foodrecipe1.*
import kotlinx.android.synthetic.main.activity_foodrecipe2.*

class foodrecipe2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodrecipe2)

        recipeFR2.setOnClickListener{
            val initializepopup = layoutInflater.inflate(R.layout.infofood2, null)

            val showpopup = Dialog(this)
            showpopup.setContentView(initializepopup)

            showpopup.setCancelable(true)
            showpopup.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            showpopup.show()
        }

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        backFR2.setOnClickListener()
        {
            val menuFR2 = Intent(this, MainActivity::class.java)
            startActivity(menuFR2)
        }
    }
}