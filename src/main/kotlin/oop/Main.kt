package oop

import oop.data.Generator
import oop.data.model.Job
import oop.data.model.Person
import oop.data.model.SearchJob

/*
ADA 3 PARADIGMA KONSEP PEMOGRAMAN:
    1. OBJECT ORIENTED PROGRAMMING ✔
    2. PROCEDURAL PROGRAMMING
    3. FUNCTIONAL PROGRAMMING
*/


fun main(args: Array<String>) {
    for (va in args) println(va)
    val person = Person()
    val job = Job()
    val searchJob = SearchJob()
    val datas = Generator()

    val newPerson = Person("eko", "kurniawan", "Bogor")
    println(newPerson)

    val secConstructor = Person("budi", "rudiansyah")
    println(secConstructor)

    println(person.sayHello("eko"))
    println(person.sayHello("eko", "aditt"))
    println(
        """
            |hi ${job.firsname},
            |are you good on ${job.profession}?
            """.trimMargin()
    )
    searchJob.searchNewJob("Android Developer")


    for (data in datas.genPerson(5)) {
        println(
            """
            | ----------------------------------------
            | firstname = ${data.firsname}
            | lastname  = ${data.lastname}
            | address   = ${data.address}
        """.trimMargin()
        )
    }
}
