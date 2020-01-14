package chapter_2

import kotlin.math.pow

/**
 * 分类             类型               位宽
 *
 * 浮点型           Double              64
 *                 Float               32
 **********************************************
 * 整型            Long                64
 *                Int                 32
 *                Short               16
 **********************************************
 * 字节型          Byte                8
 *
 *
 *
 */


fun main() {

    val aInt : Int = 8
    val bInt : Int = 0xFF
    val cInt : Int = 0b11

    println("----Int 类型")
    println(aInt)
    println(aInt)
    println(bInt)
    println(cInt)
//    println(Math.pow(2.0, 31.0) -1)
    println(2.0.pow(31.0) -1)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)


    val aLong : Long = 1214142415415
    val bLong : Long = 1214142415415L
    val cLong : Long = 1214142415415L

    println("----Long类型")
    println(aLong)
    println(bLong)
    println(cLong)
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)

    val aFloat:Float = 1.0f
    val bFloat:Float = 1.1f

    println("----Float类型")
    println(aFloat)
    println(bFloat)
    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)
    println(0.0f/0.0F)


    val aDouble : Double = 100.0
    val bDouble : Double = 100.0
    println("----Double类型")

    println(bFloat)
    println(Double.MAX_VALUE)
    println(Double.MIN_VALUE)
    println(0.0/0.0)

    println("----Short类型")
    val aShort : Short = 100
    val bShort : Short = 1000

    println(aShort)
    println(bShort)
    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)


    println("----Byte类型")
    val aByte : Byte = 100
    val bByte : Byte = 1

    println(aByte)
    println(bByte)
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
}