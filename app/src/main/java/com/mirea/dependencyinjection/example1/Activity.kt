package com.example.dependencyinjectionstart.example1

import com.mirea.dependencyinjection.example1.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse:Mouse
    @Inject
    lateinit var monitor:Monitor

    val component = DaggerNewComponent.create()
    val keyboard2 = component.getKeyboard()
    val mouse2 = component.getMouse()
    val monitor2 = component.getMonitor()
    init {
        DaggerNewComponent.create().inject(this)
    }


}