package com.viewhigh.example.easykotlin.chapter_2


/**
 * 区间实例
 */
fun main() {

    //半开区间
    val rangeDemo: IntRange = 1 until 1024
    val rangeDemo2: IntRange = 1..1024


    rangeDemo.forEach { i -> print("$i, ") }
    println()
    rangeDemo2.forEach { print("$it, ") }


    for (i in rangeDemo2) {
        println(i)
    }


    var list = listOf<String>("1", "2")


    var map = mapOf(Pair("1", "b"));
    var map2 = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)

    println(map2)
}