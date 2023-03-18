package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var Pizza :CheckBox
    private lateinit var Burger :CheckBox
    private lateinit var Samosa :CheckBox
    private lateinit var Button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        Pizza = findViewById(R.id.checkbox1)
        Burger = findViewById(R.id.checkbox2)
        Samosa = findViewById(R.id.checkbox3)
        Button = findViewById(R.id.button )

        Button.setOnClickListener {
            var totalAmount:Int=0
            val result = StringBuilder()
            result.append("Selected Items")
            if (Pizza.isChecked) {
                result.append("\n Pizza 100Rs")
                totalAmount += 100
            }
            if (Burger.isChecked) {
                result.append("\n Burger 180Rs")
                totalAmount += 180
            }
            if (Samosa.isChecked) {
                result.append("\n Samosa 50Rs")
                totalAmount += 50
            }
            result.append("\n Total: " + totalAmount + "Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}