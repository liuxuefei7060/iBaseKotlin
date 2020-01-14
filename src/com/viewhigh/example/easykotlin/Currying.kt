package chapter_5

import java.io.OutputStream

/**
 * 函数柯力化实例
 */
fun main() {

    log("Main")(System.out)("这是是一条消息")

}


fun log(tag:String)
    = fun (target : OutputStream)
    = fun (message:Any?)
    = target.write("$tag  $message".toByteArray())

