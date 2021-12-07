package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNumber:EditText
    lateinit var symbol:EditText
    lateinit var secondNumber:EditText
    lateinit var btn:Button
    lateinit var result:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNumber = findViewById(R.id.FirstNumber)
        symbol = findViewById(R.id.Symbol)
        secondNumber = findViewById(R.id.SecondNumber)
        btn= findViewById(R.id.Btn)
        result = findViewById(R.id.result)

        btn.setOnClickListener{
            result.text=getResult() }
    }




    fun getResult(): String {
      val fNumber=firstNumber.text.toString().toInt()
        val symb=symbol.text.toString()
        val sNumber=secondNumber.text.toString().toInt()

        if (symb == "+" ){
            return (fNumber+sNumber).toString() }

        if (symb == "-" ){
            return (fNumber-sNumber).toString() }

        if (symb == "*" ){
            return (fNumber*sNumber).toString() }

        if (symb == "/" ){
            return (fNumber/sNumber).toString() }

        if (symb == "=" ){
            return (fNumber==sNumber).toString() }

        if (symb == "<" ){
            return (fNumber<sNumber).toString() }

        if (symb == ">" ){
            return (fNumber>sNumber).toString() }



}