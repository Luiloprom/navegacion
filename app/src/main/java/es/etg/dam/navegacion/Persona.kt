package es.etg.dam.navegacion

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Persona(
    var nombre : String,
    var apellido : String,
    var edad : Int
) : Parcelable


