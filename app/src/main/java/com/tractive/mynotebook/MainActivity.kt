package com.tractive.mynotebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val TAG = "Main_Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun openTitlePage(){
            val intent = Intent(this, EnterTitleActivity::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.button_add)
        button.setOnClickListener {
            Log.d(TAG, "hello")

            openTitlePage()
        }
    }


}
