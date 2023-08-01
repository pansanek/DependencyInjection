package com.mirea.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mirea.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @Named("id") private val id: String,
    @Named("name")private val name: String
): ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }
}
