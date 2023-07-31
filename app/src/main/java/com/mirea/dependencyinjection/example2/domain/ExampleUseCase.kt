package com.mirea.dependencyinjection.example2.domain

import com.mirea.dependencyinjection.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}