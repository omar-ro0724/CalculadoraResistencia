package com.example.calculadoraresistencia.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable

fun DropdownSelector(label: String, options: List<String>, selected: String, onSelected: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) }

    Box(){
        OutlinedButton(onClick = { expanded = true }) {
            Text("$label: ${selected.replaceFirstChar { it.uppercase() }}")

        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { option ->
                DropdownMenuItem(text = { Text(option.replaceFirstChar { it.uppercase() })
                }, onClick = {
                    onSelected(option)
                    expanded = false
                })
            }
        }
    }
}
