package com.mojtaba_shafaei.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mojtaba_shafaei.persianFont.PersianFont

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1 = findViewById<TextView>(R.id.t1)
        val t2 = findViewById<TextView>(R.id.t2)

        t1.typeface = PersianFont.IRANSANS_LIGHT(this)
        t2.typeface = PersianFont.YEKAN_EXTRA_BLACK(this)

    }
}
