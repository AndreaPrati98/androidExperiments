package com.example.course

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Activity with purpose to learn how to use intents
 */
class SecondActivity : AppCompatActivity() {

    private var valueReceived = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        goThrough.setOnClickListener() {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        button_to_scroll_view.setOnClickListener {
            startActivity(Intent(this, ScrollViewActivity::class.java))
        }

        //in caso di intent null allora ritorna ""
        valueReceived = intent?.getStringExtra(TAG) ?: ""

        if(valueReceived.isNotEmpty()) {

            received.text = "Ciao $valueReceived"
        }


    }

    //questo serve perchè lo "static" non c'è in kotlin
    companion object {
        fun sendIntent(context: Context, value: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                //questo metodo serve a passare dati extra tramite intent
                putExtra(TAG, value)
            }
            //questo flag mi consente di 
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        //devo definire un tag composto da package + nome del valore che devo passare, in questo caso "value"
        private val TAG = SecondActivity::class.java.name + "value"

    }

    fun toScrollViewActivity(view: View) {
        Log.d("Creation", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")
        startActivity(Intent(this, ScrollViewActivity::class.java))
    }

}