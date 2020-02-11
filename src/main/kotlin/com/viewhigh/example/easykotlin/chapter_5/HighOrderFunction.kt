package com.viewhigh.example.easykotlin.chapter_5

//高阶函数


data class Student(val name: String, val age: Int) {

    fun work() {
        println("我是学生,我在学习")
    }


}


fun main() {

    val list = listOf<String>("您好", "中国", "你好", "刘胖子")
    list.forEach(::println)


    for ((index, value) in list.withIndex()) {
        println("$index   $value")
    }

    val students = ArrayList<Student>()
    var i = 0
    while (i < 10) {
        students.add(Student("小明$i", 11))
        i++
    }

    val stuNames = students.map {
        "姓名：${it.name} , 年龄：${it.age} "
    }


    stuNames.forEach(::println)

//    stuNames.flatMap {  }
//    stuNames.apply {  }
//    stuNames.let {  }
//    stuNames.forEach { element -> println(element) }
//    stuNames.forEach (){ element -> println(element) }
//    stuNames.forEach ({ element:String -> println(element) })


}