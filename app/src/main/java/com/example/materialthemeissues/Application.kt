package com.example.materialthemeissues

import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by Cillian Myles on 28/01/2020.
 * Copyright (c) 2020 Cillian Myles. All rights reserved.
 */

class Application : android.app.Application() {

    override fun onCreate() {
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        super.onCreate()
    }
}
