package com.viewhigh.example.easykotlin.chapter_5

//高阶函数


fun main(args: Array<String>) {

    //map

    val chars = charArrayOf('h', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')

    chars.map { element -> element.toUpperCase() }.forEach(::println)
    //mapFlat
    //apply

}