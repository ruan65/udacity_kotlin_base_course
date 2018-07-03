package udacityCourse.functional.Aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {

    val fish = Fish("Splashy")

    println(fish)

    val result = myWith(fish.name) {
        fish.name = toUpperCase()
    }

    println(result)

    println(fish)

    val fish1 = Fish("Sharky")

    println(fish1)

    fish1.apply { name = "Happy Sharky" }

    println(fish1)

    val let = fish1.let { it.name.toUpperCase() }
            .let { it + " fish" }
            .let { fish1.name = it; fish1 }
            .also { println("also: ${it.name}") }
            .let { it.name = "No Name" }



    println(fish1)

}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
