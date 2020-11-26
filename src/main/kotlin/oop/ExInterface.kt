package oop

import basic._NAME

interface Interaction {
    val myName: String

    // konkrit
    fun sayHello(name: String) {
        println("hi $name, my name is $myName")
    }

    fun sayHai(name: String): String

}

interface Go : Interaction {
    fun go() = println("go called")
}

interface MoveA {
    fun move(): String = "move A called"
}

interface MoveB {
    fun move(): String = "move B called"
}

class Human(override val myName: String) : Go, MoveA, MoveB {

    override fun sayHai(name: String): String {
        return "hi $name, my name is $myName"
    }

    override fun move(): String {
        val accessSuper = super<MoveA>.move()
        return accessSuper
    }


}

fun main() {
    val human = Human(_NAME.toLowerCase())
    human.sayHello("budi")
    println(human.sayHai("coki"))
    human.go()
    println(human.move())
}
