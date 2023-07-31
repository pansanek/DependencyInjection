package com.mirea.dependencyinjection.example2.data.database

import android.content.Context
import android.util.Log
import com.mirea.dependencyinjection.R
import com.mirea.dependencyinjection.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleDatabase @Inject constructor(private val context:Context, private val time:Long) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} ${time} $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
