package com.example.materialthemeissues

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

/**
 * Created by Cillian Myles on 23/01/2020.
 * Copyright (c) 2020 Cillian Myles. All rights reserved.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.android_x_name)
        setContentView(R.layout.activity_main)
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }
}
