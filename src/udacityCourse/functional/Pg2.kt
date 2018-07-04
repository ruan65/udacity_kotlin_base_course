package udacityCourse.functional

fun exampleSq() {

    val seq = sequenceOf(1, 2)
    val seqMapped: Sequence<Int> = seq.map { println("$it "); it * it } // intermediate
    println("before sum ")
    val sum = seqMapped.sum() // terminal
}

val exampleIt = {

    val lst = listOf(1, 2)
    val lstMapped: List<Int> = lst.map { println("$it "); it * it }
    println("before sum ")
    val sum = lstMapped.sum()
}

val exampleSqIter = { list: List<Int> ->

    list.asSequence()
            .filter { field ->
                print("Filter ")
                field > 0
            }.map {
                print("Map ")
            }.forEach {
                print("Each ")
            }
}

val exampleLstIter = { list: List<Int> ->

    list.filter { field ->
        print("Filter ")
        field > 0
    }.map {
        print("Map ")
    }.forEach {
        print("Each ")
    }
}


fun main(args: Array<String>) {
//    exampleSq()
//    exampleIt.invoke()

    val list = listOf<Int>(1, 2, 3)

    exampleSqIter(list)

    println()

    exampleLstIter.invoke(list)
}