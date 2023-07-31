package com.mirea.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mirea.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
        Log.d("EXAMPLE_VIEW_MODEL","$this")
    }
}
