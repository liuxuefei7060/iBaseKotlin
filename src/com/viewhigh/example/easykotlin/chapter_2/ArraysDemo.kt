package chapter_2

fun main() {
    //好记性不如啪啪啪啪的茶轴键盘
    val arraysInt = intArrayOf(1,2,3,4)
    val arraysChar = charArrayOf('H','e','l','l','o','W','o','r','l','d')
    val arrayString = arrayOf("中国", "国庆", "70周年")
    println(arraysChar)

    println(arrayString)
    println(arrayString.size)

    for (j in arrayString) {
        println(j)
    }

    arrayString.forEach { i -> print("$i, ") }
    arrayString[1] = "大庆"
    arrayString.forEach { i -> print("$i, ") }
}