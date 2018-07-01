package udacityCourse.aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("First init block")
    }

    constructor() : this(true, 9) {
        println("Running secondary constructor")
    }

    init {
        when {
            friendly -> size = volumeNeeded
            else -> size = volumeNeeded * 2
        }
    }

    init {
        println("Constructed fish of size $volumeNeeded")
    }
}

fun fishExample() {
    val fish = Fish()

    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

fun main(args: Array<String>) {
    fishExample()
}