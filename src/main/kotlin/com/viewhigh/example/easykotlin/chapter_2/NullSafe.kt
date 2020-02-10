package com.viewhigh.example.easykotlin.chapter_2

fun main() {

    println(getName().length)
    println(getName1()?.length)
}


fun getName():String {
    return "Hello"
}


fun getName1():String? {
    return null
}