package com.mirea.dependencyinjection.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor(): ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestRemote","test")
    }
}