package com.example.alisajid.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

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
        val countTextView = findViewById<TextView>(R.id.textView_count) as TextView
        val countString = countTextView.text.toString()

        // convert value to an integer and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // set the new value to textView
        countTextView.text = count.toString()
    }
}
