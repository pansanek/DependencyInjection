package com.mirea.dependencyinjection.example2.di

import com.mirea.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.mirea.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.mirea.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.mirea.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}