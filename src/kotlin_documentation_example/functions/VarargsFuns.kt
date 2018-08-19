package kotlin_documentation_example.functions

fun <T> asList(vararg args: T) : List<T> {

    val resultList = ArrayList<T>()

    args.forEachIndexed { i, elem ->
        resultList.add(i, elem)
    }

    return resultList
}


fun main(args: Array<String>) {

    val words = asList("Hello", "My", "Little", "World")

    println(words)

    val numbers = asList(1, 2, 3)

    println(numbers)
}



