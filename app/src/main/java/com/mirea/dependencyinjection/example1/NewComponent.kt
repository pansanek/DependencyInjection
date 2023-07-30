package com.mirea.dependencyinjection.example1

import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.dependencyinjectionstart.example1.Monitor
import com.example.dependencyinjectionstart.example1.Mouse
import dagger.Component

@Component
interface NewComponent {


    fun getKeyboard():Keyboard
    fun getMouse(): Mouse
    fun getMonitor(): Monitor

    fun inject(activity: Activity)
}