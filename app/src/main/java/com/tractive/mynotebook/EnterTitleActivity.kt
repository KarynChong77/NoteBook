package com.tractive.mynotebook

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_enter_title.view.*

class EnterTitleActivity : AppCompatActivity() {

    val TAG = "Title_Activity"
    val rCode = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_title)


        fun openMainPage2(){
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        fun switchValues() {
            // the input
//            val result = findViewById<EditText>(R.id.titleInput)
//            val results = result.toString()
            //val int = Intent(this, MainActivity2::class.java)
            //int.putExtra("titleInput", results)
            //startActivityForResult(int, rCode)



            val int = Intent(this, MainActivity2::class.java)
            val result = findViewById<EditText>(R.id.titleInput)
            val results = result.text.toString()
            int.putExtra("EXTRA_SESSION_ID", results);
            startActivity(int)
        }

        val button = findViewById<Button>(R.id.button_confirm)
        button.setOnClickListener {
            Log.d(TAG, "hello")

            switchValues()
        }

    }

    override fun onDestroy() {
        Utiles.hideKeyboard(this)
        super.onDestroy()
    }
}
