package chapter_4

import kotlin.reflect.KProperty

class Delegates {

    val hello by lazy {

        "Hello World"

    }
}

class X {

    operator fun  getValue(thisRef: Any?, property: KProperty<*>): String = "Hello 111"
}

fun main(args: Array<String>) {
    val delegate = Delegates()
    println(delegate.hello)
}