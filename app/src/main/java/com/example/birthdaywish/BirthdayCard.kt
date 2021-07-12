package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card.*

class BirthdayCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        val name = intent.getStringExtra("name")
        birthdaytext.text = "Happy Birthday\n$name!"
    }
}