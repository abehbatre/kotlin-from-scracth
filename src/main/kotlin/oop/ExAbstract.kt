package oop

/*
* abstract class
*
* */
abstract class Animal {
    abstract val name: String
    abstract fun action()
}


class Dog(override val name: String = "Doggy") : Animal() {
    override fun action() {
        println("1 -> run $name run !!")
    }
}


class Cat(override val name: String = "Pussycat") : Animal() {
    override fun action() {
        println("2 -> $name come dance with me !!")
    }

}


fun main() {
    val dog = Dog()
    val cat = Cat()
    val note = Note()
    val tv = TV()
    dog.action()
    cat.action()
    println("3 -> ${note.title} => ${note.note}")
    // change
    note.title = ""
    println("4 -> ${note.title} => ${note.note}")

    println(tv.initTV("samsung", "changhong", "toshiba", "xiaomi"))

}


class Note(title: String = "belajar kotlin", note: String = "encapsulation") {
    var title = title
        get() = field
        set(value) {
            if (value.isNotBlank()) field = value
            else field = "field title tidak boleh kosong"
        }

    var note = note
        get() = field
        set(value) {
            if (value.isNotBlank()) field = value
            else field = "field note tidak boleh kosong"
        }
}


class TV() {
    lateinit var brand: String

    fun initTV(vararg brands: String): String {
        var x = ""
        for (merekTv in brands) x += "$merekTv -> "
        brand = x

        return brand
    }

}
