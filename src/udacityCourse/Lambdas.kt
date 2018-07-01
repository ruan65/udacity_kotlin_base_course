package udacityCourse

val rollDice = { (1..12).shuffled().last() }

fun gamePlay(rollResult: () -> Int) {
    println(rollResult())
}

fun main(args: Array<String>) {

    gamePlay(rollDice)
}