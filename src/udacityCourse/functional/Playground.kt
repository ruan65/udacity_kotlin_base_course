package udacityCourse.functional

val waterFilter = { dirty: Int -> dirty / 2 }

data class Fish(val name: String)

val fishExample = {
    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))

    println(myFish)

    val filtered = myFish.filter { it.name.contains("i") }.joinToString("+++") { it.name }

    println(filtered)
}

fun List<Int>.allDivisibleBy(denominator: Int): List<Int> = filter { it % denominator == 0 }

fun main(args: Array<String>) {
    val waterFilter1 = waterFilter(100)

    println(waterFilter1)

    fishExample()

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    val allDivisibleByThree = numbers.allDivisibleBy(2)

    println(allDivisibleByThree)
}