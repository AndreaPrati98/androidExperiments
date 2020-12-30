package com.example.course.twoActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.example.course.R
import kotlinx.android.synthetic.main.activity_replyer.*
import kotlinx.android.synthetic.main.activity_sender.*
import kotlinx.android.synthetic.main.activity_sender.message_view

class SenderActivity : AppCompatActivity() {

    private var valueReceived = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sender)

        valueReceived = intent?.getStringExtra(ReplyerActivity.EXTRA_MESSAGE) ?: ""

        if(valueReceived.isNotEmpty()) {
            message_view.text = valueReceived
        }

    }

    companion object {
        val EXTRA_MESSAGE_PREFIX = this::class.qualifiedName
        val EXTRA_MESSAGE_SUFFIX = ".extra.SEND"
        val EXTRA_MESSAGE : String= EXTRA_MESSAGE_PREFIX+EXTRA_MESSAGE_SUFFIX

    }

    fun send_message(view: View) {

        Log.d(this::class.simpleName, "Sending message")
        val intent = Intent(this, ReplyerActivity::class.java)
        var message = editText_sender.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    }

}