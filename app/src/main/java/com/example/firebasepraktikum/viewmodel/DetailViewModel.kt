package com.example.firebasepraktikum.viewmodel
sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object loading : StatusUIDetail
}
class DetailViewModel(savedStateHandle: SavedStateHandle, private val repositorySiswa: RepositorySiswa):ViewModel() {

    private val idSiswa: Long =
        savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong()
            ?: error("idSiswa tidak ditemukan di SavedStateHandle")

    var statusUIDetail:StatusUIDetail by mutableStateOf(StatusUIDetail.loading)
        private set

    init {
        getSatuSiswa()
    }