package com.viewhigh.example.easykotlin.chapter_4.dataclass

data class Country (val name:String, val language : String)


fun main(args: Array<String>) {
    val china = Country("中国", "汉语")
    println(china)
}