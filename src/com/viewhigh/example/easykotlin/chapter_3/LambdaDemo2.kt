package chapter_3

fun main() {

    println(sum(1, 3))
    println(sum2(1, 3))
    println(sum2.invoke(1, 3))


    val arrayStrings = arrayListOf("Hello", "World")
    val arrayStrings2 = arrayOf("Hello", "你好")

    arrayStrings.forEach(::println)
    arrayStrings2.forEach(::println)


    println(sum)
    println(sum2)

}


val sum = fun(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

val sum2 =  {arg1: Int, arg2: Int -> Int
    {
        arg1 + arg2
    }
}


