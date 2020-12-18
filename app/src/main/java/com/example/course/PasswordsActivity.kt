package com.example.course

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passwords.*

class PasswordsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passwords)

        //così non serve mettere l'andata a capo come \n
        passwordsText.text = """
            Bancomat: 12345
            Facebook: montagna15
            Instagram: mare22
            
        """.trimIndent()
    }

    companion object {
        fun sendIntent(contenxt: Context) {
            contenxt.startActivity(Intent(contenxt, PasswordsActivity::class.java))
        }
    }
}