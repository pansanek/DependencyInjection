package com.mirea.dependencyinjection.example2.di

import com.mirea.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.mirea.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {


    @Binds
    fun provideRepository(impl:ExampleRepositoryImpl):ExampleRepository
}