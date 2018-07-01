package udacityCourse

import java.util.*

fun feedFish() {
    val day = randomDay()
    val food = fishFood(day)

    shouldChangeWater(randomDay())

    println("Today is $day and fish eat $food")

    if (shouldChangeWater(randomDay())) {
        println("Change the water!!!")
    }
}

fun fishFood(day: String): String {

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun canAddFish(volumeGl: Double, currentFish: List<Int>,
               newFishSize: Int = 2, hasDecoration: Boolean = true): Boolean {

    val countVolume = if (hasDecoration) volumeGl * .8 else volumeGl

    return if (currentFish.isEmpty()) newFishSize < countVolume else
    (currentFish.reduce { acc, i -> acc + i } + newFishSize) <= countVolume
}

fun main(args: Array<String>) {

//    feedFish()




    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecoration = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}