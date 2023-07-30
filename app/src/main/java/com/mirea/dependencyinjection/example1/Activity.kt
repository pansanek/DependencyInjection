package com.example.dependencyinjectionstart.example1

import com.mirea.dependencyinjection.example1.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }


}