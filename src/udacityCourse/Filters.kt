package udacityCourse

val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper", "salt" )

fun main(args: Array<String>) {

    val filteredSpices = spices.filter { it.startsWith('c') }.sortedBy { it.length }


    println(filteredSpices)

    val takenFirst = spices.take(5).filter { it.endsWith('y') }

    println(takenFirst)
}