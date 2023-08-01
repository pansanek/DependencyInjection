package com.mirea.dependencyinjection.example2.di

import com.mirea.dependencyinjection.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @ApplicationScope
    @TestQualifier
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @ProdQualifier
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}
