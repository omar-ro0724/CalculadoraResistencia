package com.example.calculadoraresistencia.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResistorCalculatorScreen() {
    val bandaValores = listOf("negro", "marron", "rojo", "naranja", "amarillo", "verde", "azul", "violeta", "gris", "blanco")
    val multiplicadores = listOf("negro", "marron", "rojo", "naranja", "amarillo")
    val tolerancias = listOf("dorado", "plateado", "ninguno")

    var banda1 by remember { mutableStateOf("marron") }
    var banda2 by remember { mutableStateOf("negro") }
    var banda3 by remember { mutableStateOf("negro") }
    var tolerancia by remember { mutableStateOf("dorado") }
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        DropdownSelector("Banda 1", bandaValores, banda1) { banda1 = it }
        DropdownSelector("Banda 2", bandaValores, banda2) { banda2 = it }
        DropdownSelector("Multiplicador", multiplicadores, banda3) { banda3 = it }
        DropdownSelector("Tolerancia", tolerancias, tolerancia) { tolerancia = it }

        Button(onClick = {
            resultado = calcularResistencia(banda1, banda2, banda3, tolerancia)
        }) {
            Text("Calcular")
        }

        Text("Resultado: $resultado")
    }
}
