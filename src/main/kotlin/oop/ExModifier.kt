package oop

interface Contract {
    val name: String
    fun setupView()
    fun setupVM(vmId: Int)
}

abstract class ExBase(private val layout: Int) : Contract {
    private fun iniPrivateFunc() {
        println("iniPrivateFunc called")
    }
}

open class ExModifier(override val name: String) : ExBase(812735) {

    override fun setupView() {
    }

    override fun setupVM(vmId: Int) {
    }

    protected fun destroyClass() {
        println("destroyClass called")
    }

}

class Main : ExModifier("adit") {

}



fun main() {
    val m = Main()
    println(m.name)
}
