package com.mirea.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mirea.dependencyinjection.example2.domain.ExampleRepository
import com.mirea.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("EXAMPLE_VIEW_MODEL_2","$this")
    }
}
