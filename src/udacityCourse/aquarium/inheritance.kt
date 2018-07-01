package udacityCourse.aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {

    val pleco = Plecostomus()
    println("Fish has color: ${pleco.color}")
    pleco.eat()
}
