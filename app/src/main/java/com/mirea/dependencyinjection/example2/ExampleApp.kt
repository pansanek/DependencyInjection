package com.mirea.dependencyinjection.example2

import android.app.Application
import com.mirea.dependencyinjection.example2.di.DaggerApplicationComponent

class ExampleApp:Application() {

     val component by lazy {
        //DaggerApplicationComponent.builder().context(application).time(System.currentTimeMillis()).build() }
        DaggerApplicationComponent.factory().create(this,System.currentTimeMillis())
    }
}