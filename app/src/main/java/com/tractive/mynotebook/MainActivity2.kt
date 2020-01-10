package com.tractive.mynotebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    val TAG = "Main_Activity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fun openTitlePage() {
            val intent = Intent(this, EnterTitleActivity::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.button_add)
        button.setOnClickListener {
            Log.d(TAG, "Goodbye")

            openTitlePage()
        }


        val sessionId = intent?.getStringExtra("EXTRA_SESSION_ID")
        Log.d(TAG, "onCreate sessionId: " + sessionId)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)

        val sessionId = intent?.getStringExtra("EXTRA_SESSION_ID")
        Log.d(TAG, "onNewIntent sessionId: " + sessionId)

//        findViewById<TextView>(R.id.titleText).apply {
//            text = sessionId
//        }

        //changes the text of the button
        val buttonChange = findViewById<Button>(R.id.buttonNew)
        buttonChange.setText(sessionId)

    }

    override fun onDestroy() {
        Utiles.hideKeyboard(this)
        super.onDestroy()
    }

}

