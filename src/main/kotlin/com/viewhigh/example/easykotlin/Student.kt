package com.viewhigh.example.easykotlin

open class Person {
    init {
        println("Person init method")
    }

}


class Student2 constructor(private val age: Int, private val name: String) : Person(){

    companion object {
        @JvmStatic
        val TAG = "Person"
    }


    init {
        println("Student2 init method")
    }

    fun work() {

        println("work method")

    }

    override fun toString(): String {
        return "$name  的年龄  $age"
    }
}

fun main() {
    val student2 = Student2(20, "Hello")
    println(student2)
}