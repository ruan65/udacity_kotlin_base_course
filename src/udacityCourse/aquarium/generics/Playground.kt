package udacityCourse.aquarium.generics

fun <T> singletonList(item: T): List<T> {
    return listOf(item)
}

fun main(args: Array<String>) {
    val singleHello = singletonList("hello")

    println(singleHello)

//    singleHello[1] = "Bye!"

    val strings = mutableListOf<String>()

    strings[0] = "Hello"
}