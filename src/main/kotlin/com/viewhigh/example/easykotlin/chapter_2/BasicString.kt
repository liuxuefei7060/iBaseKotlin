package com.viewhigh.example.easykotlin.chapter_2

fun main() {
    //在Kotlin中  ==与equals相同，  ===判定对象是否相等

    var str : String = "HelloWorld"
    var fromChars = String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))
    println(str)
    println(str == fromChars)
    println(str.equals( fromChars))
    println(str === fromChars)


    println("字符串模板")
    println("str  $str")
    println("str == fromChars  : ${str == fromChars}")


    println("hello \"Trump\"")
    println("$1000")

    var str2 = """
        Hello 
        World
        中国
        大发
        ${str.length}
    """

    println(str2)
    //Java中 length为方法，
    //Kotlin为属性
    println(str2.length)
}