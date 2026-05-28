package com.mylab.myapplication.di

import com.mylab.myapplication.data.NumberRepository
import com.mylab.myapplication.data.RandomNumberRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @Provides
    @Singleton
    fun provideNumberRepository(): NumberRepository = RandomNumberRepository()
}

