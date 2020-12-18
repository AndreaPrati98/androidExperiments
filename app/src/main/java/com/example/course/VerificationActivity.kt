package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.activity_verification.*

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        unlockButton.setOnClickListener {
            //controllo se quello che abbiamo scritto corrisponde a quello che abiamo messo
            if ("2021" == editTextNumber.text.toString().trim()) {
                PasswordsActivity.sendIntent(this)
            } else {
                //Toast è messaggio di pop-up
                Toast.makeText(this, "wrong password", Toast.LENGTH_SHORT).show()
            }
        }
    }

}