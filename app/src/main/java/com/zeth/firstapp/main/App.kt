package com.zeth.firstapp.main

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(), ViewModelStoreOwner {
    private lateinit var viewModelProvider: ViewModelProvider
    private val appViewModelStore: ViewModelStore by lazy { ViewModelStore() }

    override fun onCreate() {
        super.onCreate()
        viewModelProvider = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory());
    }


    fun getSharedViewModel(): AppViewModel {
        return viewModelProvider[AppViewModel::class.java];
    }

    override val viewModelStore: ViewModelStore
        get() = appViewModelStore
}