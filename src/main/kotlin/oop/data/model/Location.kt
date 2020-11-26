package oop.data.model

data class Location(val city: String) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Location -> other.city == this.city
            else -> false
        }
    }

    override fun hashCode(): Int {
//        println("${city.hashCode()} -> ${this.city}")
        return city.hashCode()
    }

    override fun toString(): String {
        return """city : ${this.city}"""
    }
}
