package com.example.dependencyinjectionstart.example1

import com.mirea.dependencyinjection.example1.Component

class Activity {

    val computer: Computer = Component().getComputer()


}