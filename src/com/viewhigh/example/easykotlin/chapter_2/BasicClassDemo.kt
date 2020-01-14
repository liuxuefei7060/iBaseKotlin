package chapter_2

fun main() {

    val clothes = Clothes(2, "红色")
    val trousers = Trousers(2, "红色")
    println(clothes)
    println(trousers)

    println(trousers is Clothes)

}


//定义个类   Any是有所有类的父类
open class Clothes constructor(private val size: Int, private val color: String) {

    //初始化函数
    init {
        println("${this.javaClass.simpleName}  大小： $size   颜色 $color")
    }
}

//定义裤子类
class Trousers(size: Int, color: String) : Clothes(size, color) {

    init {
        println("裤子类")
    }
}


