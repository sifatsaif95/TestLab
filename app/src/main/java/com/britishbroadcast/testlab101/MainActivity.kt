package com.britishbroadcast.testlab101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input_button.setOnClickListener{
            outpup_textview.text = input_edittext.text.toString()
        }
        next_button.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}