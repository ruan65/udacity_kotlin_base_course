package udacityCourse.collections

import udacityCourse.books.Book

fun main(args: Array<String>) {

    val allWilliamBooks = setOf<Book>(
            Book("Hamlet", "WS", pages = 0)
    , Book("All's Well That Ends Well", "WS", pages = 0)
    , Book("As You Like It", "WS", pages = 0)
    , Book("The Merchant of Venice", "WS", pages = 0)
    , Book("A Midsummer Night's Dream", "WS", pages = 0)
    , Book("Much Ado About Nothing", "WS", pages = 0)
    , Book("Taming of the Shrew", "WS", pages = 0)
    , Book("Twelfth Night", "WS", pages = 0)
    )

    val library = mapOf<String, Set<Book>>("WS" to allWilliamBooks)

    println(library)

    val any = library["WS"]?.any { it.title.equals("Hamlet") }

    println(any)

    val moreBooks = mutableMapOf<String, Set<Book>>()

    println(moreBooks)

    moreBooks.put("WS", allWilliamBooks)

    println(moreBooks)

    val putResult = moreBooks.getOrPut("Gorky") { setOf<Book>() }

    println(putResult)
    println(moreBooks)



}