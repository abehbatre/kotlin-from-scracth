@file:Suppress("unused")

package basic


fun main(args: Array<String>) {

//  get value of args
    for (isi in args) println(isi)

//
    val array = arrayListOf("a", "d", "i", "t")
    for (i in array.indices) println("$i -> ${array[i]}")

    for (i in 0..100) {
        if (i % 2 == 0) continue
        println(i)
    }
    println("total size : ${array.size}")

    "adit".fExtention()
    println(fVarArg(KALI, 114, 95, 82, 79, 64, 53, 42, 35, 27, 13, 9))
    println(fRecursiveCall(20))
    println(fLambda(_NAME, 25))

    println(fHighOrder(_NAME) { it.toUpperCase() })
    println(fAnonymous(_NAME))
    repeat(1) { println(fInline { "adit" }) }
    println(fLabelExample())
    fLabelExample2(_NAME) test@{
        if (it.isBlank()) return@test
        else println(_NAME)
    }
}

// single line function
fun fSingleLine(a: Int) = a * 2

// extention function
fun String.fExtention() {
    println("hello $this, welcome to kotlin")
}

// return with value function
fun fReturnValue(type: Int, a: Long, b: Long): Long {
    return when (type) {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> if (a == 0L || b == 0L) 0 else a / b
        else -> 0
    }
}

// var argument function
fun fVarArg(type: Int, vararg values: Int): Int {
    var total = 1
    when (type) {
        1 -> for (value in values) total += value
        2 -> for (value in values) total -= value
        3 -> for (value in values) total *= value
        4 -> for (value in values) total /= value
    }
    return total
}


// recursive call function
fun fRecursiveCall(times: Long, total: Long = 1): Long {
    return when (times) {
        1L -> total
        else -> fRecursiveCall(times - 1, total * times)
    }
}


// tail recursive call function
tailrec fun fTailRecursiveCall(times: Int) {
    println("recursive $times")
    if (times != 0) {
        fTailRecursiveCall(times - 1)
    }
}


// lambda function
val fLambda: (String, Int) -> String = { s, age ->
    """
        |name : $s
        |age  : $age
    """.trimMargin()
}


// high order function
fun fHighOrder(name: String, transformer: (String) -> String): String {
    return "Hi ${transformer(name)}"
}


// anonymous function
val fAnonymous = fun(v: String): String {
    return if (v.isBlank()) "UPS" else v.toUpperCase()
}

val fAnonymous2 = fHighOrder("adit", fun(v: String): String {
    return if (v.isBlank()) "UPS" else v.toUpperCase()
})


// closure
var counter = 0
val fClosure: () -> Unit = {
    println("Lambda inc")
    counter.inc()
}


// inline
inline fun fInline(name: () -> String): String {
    return "halo mas ${name()} pie kabare ~"
}


// label
fun fLabelExample() {
    loopI@ for (i in 2..100) {
        loopJ@ for (j in 1..5) {
            println("$i * $j = ${i * j}")
        }
        if (i >= 3) break@loopI
    }

}

fun fLabelExample2(name: String, operation: (String) -> Unit): Unit = operation(name)


