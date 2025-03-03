package com.example.calculator.secondapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.calculator.R

class calculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)
        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val resultado = findViewById<TextView>(R.id.resultado)

        val botonSumar = findViewById<Button>(R.id.boton_sumar)
        val botonRestar = findViewById<Button>(R.id.boton_restar)
        val botonMultiplicar = findViewById<Button>(R.id.boton_multiplicar)
        val botonDividir = findViewById<Button>(R.id.boton_dividir)

        botonSumar.setOnClickListener {
            val num1 = numero1.text.toString().toDoubleOrNull()
            val num2 = numero2.text.toString().toDoubleOrNull()
            resultado.text = if (num1 != null && num2 != null) {
                "Resultado: ${num1 + num2}"
            } else {
                "Error: Entrada inválida"
            }
        }

        botonRestar.setOnClickListener {
            val num1 = numero1.text.toString().toDoubleOrNull()
            val num2 = numero2.text.toString().toDoubleOrNull()
            resultado.text = if (num1 != null && num2 != null) {
                "Resultado: ${num1 - num2}"
            } else {
                "Error: Entrada inválida"
            }
        }

        botonMultiplicar.setOnClickListener {
            val num1 = numero1.text.toString().toDoubleOrNull()
            val num2 = numero2.text.toString().toDoubleOrNull()
            resultado.text = if (num1 != null && num2 != null) {
                "Resultado: ${num1 * num2}"
            } else {
                "Error: Entrada inválida"
            }
        }

        botonDividir.setOnClickListener {
            val num1 = numero1.text.toString().toDoubleOrNull()
            val num2 = numero2.text.toString().toDoubleOrNull()
            resultado.text = if (num1 != null && num2 != null && num2 != 0.0) {
                "Resultado: ${num1 / num2}"
            } else {
                "Error: Entrada inválida o división por cero"
            }
        }
    }
}