package com.tractive.mynotebook

import android.app.Activity
import android.content.Context
import android.nfc.Tag
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService


class Utiles {
    companion object{
        val TAG = "Utiles"


//        fun hideKeyboard(activity: Activity) {
//
//            Log.d(TAG, "Keyboard")
//
//            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//            //Find the currently focused view, so we can grab the correct window token from it.
//            var view = activity.currentFocus
//            //If no view currently has focus, create a new one, just so we can grab a window token from it
//            if (view == null) {
//                view = View(activity)
//            }
//            imm!!.hideSoftInputFromWindow(view!!.windowToken, 0)
//        }

        fun hideKeyboard(activity: Activity) {
            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            if (imm.isActive)
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
        }

    }
}