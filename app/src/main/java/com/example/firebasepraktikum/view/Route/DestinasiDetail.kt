package com.example.firebasepraktikum.view.Route

import com.example.firebasepraktikum.R

object DestinasiDetail : DestinasiNavigasi{
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val  itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}