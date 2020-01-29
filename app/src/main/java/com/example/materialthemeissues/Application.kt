package com.example.materialthemeissues

import android.content.res.AssetManager
import android.graphics.Typeface
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by Cillian Myles on 28/01/2020.
 * Copyright (c) 2020 Cillian Myles. All rights reserved.
 */

class Application : android.app.Application() {

    companion object {
        private const val PATH_OPEN_SANS = "fonts/OpenSans-Regular.ttf"
        private const val PATH_OPEN_SANS_BOLD = "fonts/OpenSans-Regular.ttf"
        private const val PATH_OPEN_SANS_ITALIC = "fonts/OpenSans-Regular.ttf"
        private const val PATH_OPEN_SANS_BOLD_ITALIC = "fonts/OpenSans-Regular.ttf"

        lateinit var FONT_OPEN_SANS: Typeface
        lateinit var FONT_OPEN_SANS_BOLD: Typeface
        lateinit var FONT_OPEN_SANS_ITALIC: Typeface
        lateinit var FONT_OPEN_SANS_BOLD_ITALIC: Typeface
    }

    override fun onCreate() {
        setupFonts()
        super.onCreate()
    }

    private fun setupFonts() {
        FONT_OPEN_SANS = assets.fromPath(PATH_OPEN_SANS)
        FONT_OPEN_SANS_BOLD = assets.fromPath(PATH_OPEN_SANS_BOLD)
        FONT_OPEN_SANS_ITALIC = assets.fromPath(PATH_OPEN_SANS_ITALIC)
        FONT_OPEN_SANS_BOLD_ITALIC = assets.fromPath(PATH_OPEN_SANS_BOLD_ITALIC)

        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath(PATH_OPEN_SANS)
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }

    private fun AssetManager.fromPath(path: String): Typeface {
        return Typeface.createFromAsset(this, path)
    }
}
