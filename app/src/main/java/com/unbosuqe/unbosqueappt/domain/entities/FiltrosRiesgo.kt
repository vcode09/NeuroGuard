package com.unbosuqe.unbosqueappt.domain.entities

data class FiltrosRiesgo(
    val acvAntencedentes: Boolean,
    val acvFamiliar: Boolean,
    val sistolica: Int,
    val diastolica: Int,
    val fumador: Boolean,
    val diabetes: Boolean,
    val colesterol: Boolean,
    val sedentarismo: Boolean,
    val consumoAlcohol: Boolean,
    val sexo: String,
)
