package com.bignerdranch.android.criminal_intent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {


    private val crimeRepository = CrimeRepository.get()
    val crimesListLiveData = crimeRepository.getCrimes()
}