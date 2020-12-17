package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

/**
 * This activity is used to learn how to transfer data through activities
 */
class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        button.setOnClickListener {
            val sender = edit.text.toString()
            //prelevo il testo e lo passo come messaggio stringa
            SecondActivity.sendIntent(this, sender)
        }
    }
}