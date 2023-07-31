package com.mirea.dependencyinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mirea.dependencyinjection.R
import com.mirea.dependencyinjection.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel


    private val component by lazy {
        DaggerApplicationComponent.builder().context(application).time(System.currentTimeMillis()).build() }
    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}