package com.example.helloformxml

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var btnSaludar: Button
    private lateinit var tvMensaje: TextView
    private lateinit var tvContador: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.etNombre)
        btnSaludar = findViewById(R.id.btnSaludar)
        tvMensaje = findViewById(R.id.tvMensaje)
        tvContador = findViewById(R.id.tvContador)

        // Deshabilitar el botón si no hay texto
        btnSaludar.isEnabled = false

        etNombre.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Habilita o deshabilita el botón
                btnSaludar.isEnabled = !s.isNullOrEmpty()

                // Contador de caracteres
                val longitud = s?.length ?: 0
                tvContador.text = "$longitud / 20"
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // Evento del botón
        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                tvMensaje.text = "Introduce tu nombre"
            } else {
                tvMensaje.text = "Hola, $nombre"
            }

            // Ocultar teclado al pulsar
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(etNombre.windowToken, 0)
        }
    }

    // Resetear interfaz al salir
    override fun onStop() {
        super.onStop()
        resetUi()
    }

    private fun resetUi() {
        etNombre.text.clear()
        tvMensaje.text = ""
        tvContador.text = "0 / 20"
        btnSaludar.isEnabled = false
    }
}
