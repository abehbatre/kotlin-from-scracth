@file:Suppress("unused", "SpellCheckingInspection", "UNUSED_PARAMETER")

package oop.data.model

// constructor
open class Person(
    var firsname: String = "adit",
    var lastname: String = "pratama",
    var address: String? = null
) {

    // initializer
    init {
        // println("user : $firsname telah dibuat")
    }

    // secondary constructor
    constructor(firsname: String, lastname: String) : this(firsname, lastname, null) {
        println("user : $firsname telah dibuat dengan secondary constructor")
    }

    // function on object
    fun sayHello(you: String): String = "hi $you, my name $firsname"
    // function overloading on object
    fun sayHello(you: String, firsname: String): String = "hi $you, my name ${this.firsname}"
}


open class Job(var profession: String = "Kotlin Dev.") : Person() {
    open fun searchNewJob(profession: String) {
        println("hi $firsname, are you is looking for a job in $profession?")
    }
}

class SearchJob(profession: String = "") : Job(profession) {
    override fun searchNewJob(profession: String) {
        super.searchNewJob(profession)
    }
}
