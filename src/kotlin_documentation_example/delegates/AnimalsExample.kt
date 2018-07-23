package kotlin_documentation_example.delegates

interface AnimalSound {
    fun makeSound()

    fun makeNoise() {
        println("Hrum, hrum")
    }
}

class CatSound : AnimalSound {

    override fun makeSound() {

        println("Meiwow, miau")
    }
}

class DogSound : AnimalSound {
    override fun makeSound() {

        println("Wouf, wouwf")
    }
}

class Animal(animalSound: AnimalSound) : AnimalSound by animalSound {
    override fun makeNoise() {
        println("Hruuuuuuuu!!!!!")
    }
}


fun main(args: Array<String>) {
    val catSound = CatSound()

    Animal(catSound).makeSound()

    val dog = Animal(DogSound())

    dog.makeSound()
    dog.makeNoise()

}