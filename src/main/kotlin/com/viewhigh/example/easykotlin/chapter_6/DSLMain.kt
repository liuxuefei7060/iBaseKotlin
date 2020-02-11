package com.viewhigh.example.easykotlin.chapter_6


fun html(block: Tag.() -> Unit): Tag {
    return Tag("html").apply { block(this) }
}

fun Tag.head(block: Head.() -> Unit): Tag {
    return Head().apply { block(this) }
}

fun Tag.body(block: Body.() -> Unit): Tag {
    return Body().apply { block(this) }
}

class StringNode(private val content:String):Node {
    override fun render(): String {
        return content
    }

}

class Head:Tag("head")

class Body:Tag("body") {
    var id by MapDelegate(properties)

    var `class` by MapDelegate(properties)
}

fun main(args: Array<String>) {

    html {
        "id"("htmlId")
        "head" {
            "id"("headId")
        }
        body {
            id="bodyId"
            `class`="bodyClass"
            "a"{
                "herf"("www.baidu.com")
                + "百度"
            }

        }

    }.render().let(::println)
}