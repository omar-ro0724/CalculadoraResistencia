package com.example.calculadoraresistencia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadoraresistencia.ui.theme.CalculadoraResistenciaTheme
import com.example.calculadoraresistencia.ui.theme.ResistorCalculatorScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraResistenciaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ResistorCalculatorScreen() // Aquí se carga la calculadora
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResistorCalculatorScreenPreview() {
    CalculadoraResistenciaTheme {
        ResistorCalculatorScreen()
    }
}
