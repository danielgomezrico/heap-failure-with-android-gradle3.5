package com.lahaus.heaptest

import android.app.Application
import com.heapanalytics.android.Heap

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        // Enable heap just for non debug builds
        if (!BuildConfig.DEBUG) {
            Heap.init(applicationContext, "id", BuildConfig.DEBUG)
        }
    }
}