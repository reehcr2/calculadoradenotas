package com.example.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener{
            val n1 = Integer.parseInt(nota1.text.toString().trim())
            val n2 = Integer.parseInt(nota2.text.toString().trim())
            val falt = Integer.parseInt(faltas.text.toString().trim())

            val media = (n1 + n2) / 2

            if (media >= 6 && falt <= 10){
                resultado.setText("Aluno foi Aprovado" + "\n" +
                        "Nota final: $media"  + "\n" +
                        "Faltas: $falt")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi Reprovado" + "\n" +
                        "Nota final: $media" + "\n" +
                        "Faltas: $falt"
                )
                resultado.setTextColor(Color.RED)
            }
           nota1.setText("")
           nota2.setText("")
           faltas.setText("")
           nota1.requestFocus()
        }

    }
}