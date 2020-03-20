package com.vladzkv.likeness

import android.app.Application

/**
 * Created by kirill on 20.03.2020.
 */
class Likeness : Application() {

    companion object {
        lateinit var instance: Likeness
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}