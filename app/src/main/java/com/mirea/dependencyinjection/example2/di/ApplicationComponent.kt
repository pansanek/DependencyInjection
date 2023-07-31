package com.mirea.dependencyinjection.example2.di

import com.mirea.dependencyinjection.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class,DomainModule::class,ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}