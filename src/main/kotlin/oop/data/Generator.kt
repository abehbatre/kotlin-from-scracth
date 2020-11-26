package oop.data

import io.github.serpro69.kfaker.Faker
import oop.data.model.Location
import oop.data.model.Person


open class Generator {
    private val faker = Faker()
    open fun genPerson(howMuch: Int = 5): ArrayList<Person> {
        val person = ArrayList<Person>()
        for (i in 1..howMuch) person.add(
            Person(
                faker.name.firstName(),
                faker.name.lastName(),
                faker.address.fullAddress()
            )
        )
        return person
    }

    open fun genLocation(howMuch: Int = 50): ArrayList<Location> {
        val city = ArrayList<Location>()
        for (i in 1..howMuch) city.add(Location(faker.address.city()))

        return city
    }
}
