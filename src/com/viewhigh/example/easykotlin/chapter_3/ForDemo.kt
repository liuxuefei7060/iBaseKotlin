package chapter_3

fun main() {

    val arrsNumber = arrayOf("1", "23", "4", "hello ", "World")

    for (i in arrsNumber) {
        println(i)
    }


    for ((index ,value) in arrsNumber.withIndex()) {

        println("($index, $value)")
    }
}