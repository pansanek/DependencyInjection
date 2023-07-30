package com.mirea.dependencyinjection.example2.domain

import com.mirea.dependencyinjection.example2.domain.ExampleRepository

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}