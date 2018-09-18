package com.example.alisajid.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    private fun showRandomNumber() {

        // get count from intent
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // place count limit in the 'random' label textView
        textView_rand_text.text = getString(R.string.random_text, count)

        // generate a random number from 0 to count
        val randomNumber: Int = (Math.random() * (count + 1)).toInt()

        // display the generated random number
        textView_rand_count.text = randomNumber.toString()
    }
}
