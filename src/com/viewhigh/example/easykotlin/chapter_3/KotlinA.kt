package chapter_3

class KotlinA {
    var b :Int = 0
        get() {
            println("b value is $field")
            return field
        }
        set(value) {
            println("1111")
            field = value
        }


    //延迟加载
    lateinit var c :String
    lateinit var d :X

    val e : X  by lazy {
        X()
    }

}

class X