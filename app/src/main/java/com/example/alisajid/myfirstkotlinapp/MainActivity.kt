package com.example.alisajid.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView_count

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, resources.getString(R.string.toast_message), Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {

        // get the value from textView
        val countString = textView_count.text.toString()

        // convert value to an integer and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // set the new value to textView
        textView_count.text = count.toString()
    }
}
