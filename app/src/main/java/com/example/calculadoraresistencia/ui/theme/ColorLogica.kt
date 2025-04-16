package com.example.calculadoraresistencia.ui.theme

fun calcularResistencia(b1: String, b2: String, b3: String, tol: String): String {
    val valores = mapOf(
        "negro" to 0,
        "marron" to 1,
        "rojo" to 2,
        "naranja" to 3,
        "amarillo" to 4,
        "verde" to 5,
        "azul" to 6,
        "violeta" to 7,
        "gris" to 8,
        "blanco" to 9
    )

    val multiplicadores = mapOf(
        "negro" to 1,
        "marron" to 10,
        "rojo" to 100,
        "naranja" to 1_000,
        "amarillo" to 10_000
    )

    val tolerancias = mapOf(
        "dorado" to 5,
        "plateado" to 10,
        "ninguno" to 20
    )

    val valor1 = valores[b1] ?: 0
    val valor2 = valores[b2] ?: 0
    val multiplicador = multiplicadores[b3] ?: 1
    val tolerancia = tolerancias[tol] ?: 0

    val resultado = (valor1 * 10 + valor2) * multiplicador
    return "$resultado Ω ± $tolerancia%"
}