package com.mirea.dependencyinjection.example1

import com.example.dependencyinjectionstart.example1.*
import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {



    fun inject(activity: Activity)
}