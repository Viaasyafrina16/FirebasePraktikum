package com.example.firebasepraktikum.viewmodel
sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object loading : StatusUIDetail
}