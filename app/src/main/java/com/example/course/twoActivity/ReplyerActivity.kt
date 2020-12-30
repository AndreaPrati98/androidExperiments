package com.example.course.twoActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.course.R
import com.example.course.SecondActivity
import kotlinx.android.synthetic.main.activity_replyer.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_sender.*
import kotlinx.android.synthetic.main.activity_replyer.message_view as message_view1

class ReplyerActivity : AppCompatActivity() {

    private var valueReceived = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_replyer)

        valueReceived = intent?.getStringExtra(SenderActivity.EXTRA_MESSAGE) ?: ""

        if(valueReceived.isNotEmpty()) {
            message_view.text = valueReceived
        }

    }

    companion object{
        val EXTRA_MESSAGE_PREFIX = this::class.qualifiedName
        val EXTRA_MESSAGE_SUFFIX = ".extra.REPLY"
        val EXTRA_MESSAGE : String= EXTRA_MESSAGE_PREFIX+EXTRA_MESSAGE_SUFFIX

    }

    fun reply_message(view: View) {

        Log.d(this::class.simpleName, "Replying message")
        val intent = Intent(this, SenderActivity::class.java)
        var message = editText_replyer.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))

    }

}