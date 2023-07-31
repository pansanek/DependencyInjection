package com.mirea.dependencyinjection.example2.di

import android.content.Context
import com.mirea.dependencyinjection.example2.data.database.ExampleDatabase
import com.mirea.dependencyinjection.example2.presentation.ExampleViewModel
import com.mirea.dependencyinjection.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class,DomainModule::class,ViewModelModule::class])
interface ApplicationComponent {


    fun getViewModel():ExampleViewModel

    fun getDatabase(): ExampleDatabase
    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface ApplicationComponentBuilder{
//
//        @BindsInstance
//        fun context(context:Context):ApplicationComponentBuilder
//
//        @BindsInstance
//        fun time(time:Long):ApplicationComponentBuilder
//
//        fun build():ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ):ApplicationComponent
    }
}