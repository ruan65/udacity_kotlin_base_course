package udacityCourse


fun whatShouldIDoToday(
        mood: String,
        weather: String = "sunny",
        temperature: Int = 24
): String {




    return when {
        doNotWakeUP(mood, temperature = 10) -> "Do not even wake up"
        else -> "Drink some coffee"
    }
}

fun doNotWakeUP(mood: String, weather: String = "sunny", temperature: Int = 24) =
        mood == "sad" && temperature < 15

fun main(args: Array<String>) {

    println("Enter your mood")

    val userInput = readLine()!!

    println(whatShouldIDoToday(userInput, "rainy", 10))
}