package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [StorageModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory{
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context):AppComponent
    }

    fun inject(activity: RegistrationActivity)
}