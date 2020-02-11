package com.viewhigh.example.easykotlin.chapter_7

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * 协程
 */
suspend fun main() {

    println("协程--- 程序启动")
    GlobalScope.launch {
        println("Hello 协程开启")
        delay(1000L)
        println("Hello 协程结束")

    }

    runBlocking { delay(2000L) }
    println("协程--- 程序结束")

}