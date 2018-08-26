package kotlin_documentation_example.functions

fun <A, T> Collection<T>.myFold(
        initial: A,
        operation: (acc: A, elem: T) -> A
): A {

    var accumulator = initial

    for (each: T in this) {
        accumulator = operation(accumulator, each)
    }
    return accumulator
}

fun main(args: Array<String>) {

    val list = listOf<Int>(100, 300, 900)

    println(list.fold(0) { total, next -> total + next })

    println(list.myFold(1000) { acc, each -> acc + each })
}