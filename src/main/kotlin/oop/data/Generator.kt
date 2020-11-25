package oop.data

import io.github.serpro69.kfaker.Faker
import oop.data.model.Person


class Generator {
    private val faker = Faker()

    fun genPerson(howMuch: Int = 5): ArrayList<Person> {
        val person = ArrayList<Person>()
        for (i in 0..howMuch) person.add(
            Person(
                faker.name.firstName(),
                faker.name.lastName(),
                faker.address.fullAddress()
            )
        )
        return person
    }
}
