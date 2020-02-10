package com.viewhigh.example.easykotlin.chapter_3

/**
 * 自定义复数类 , 自定义操作符
 */

class ComplexNumber constructor(private val real:Double, private val imaginary:Double) {


    operator fun plus (other: ComplexNumber) : ComplexNumber {

        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }


    override fun toString(): String {
        return "($real , $imaginary)"
    }

}


fun main() {

    val first = ComplexNumber(1.0,3.0);
    val second = ComplexNumber(1.0,4.0);

    println(first + second)
}