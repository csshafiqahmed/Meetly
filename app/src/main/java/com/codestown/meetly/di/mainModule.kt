package com.codestown.meetly.di

import com.codestown.meetly.repository.MainRepository
import com.codestown.meetly.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    single { MainRepository(get()) }
    viewModel { MainViewModel(get()) }

}
