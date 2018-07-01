package udacityCourse.books

import java.util.*

const val MAX_ALLOWED_BOOK_BORROWED = 5


open class Book(val title: String, val author: String, val year: Int = -1, var pages: Int) {

    protected var currentPage = 0

    companion object {
        const val BASE_BOOK_URL = "http://uda.lib.com"
    }

    open fun readPage() {
        currentPage++
    }

    override fun toString(): String {
        return "Book(title='$title', author='$author', currentPage=$currentPage)"
    }

    fun description(): Pair<String, String> = title to author

    fun fullDescription(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow(borrowed: Int): Boolean = borrowed < MAX_ALLOWED_BOOK_BORROWED

    fun printUrl() = println("${BASE_BOOK_URL}.${title.toLowerCase().replace(" ", "-")}.html")

}

fun Book.getWeight() = pages * 1.5

fun Book.tornPages(torn: Int) {
    pages = if (torn <= pages) pages - torn else 0
}

class E_Book(title: String, author: String, year: Int, pages: Int) : Book(title, author, year, pages) {

    override fun readPage() {
        currentPage += 250
    }
}

class Puppy(val name: String) {
    fun playWithBook(book: Book) {
        book.tornPages((0..10).shuffled().last())
    }
}

fun main(args: Array<String>) {

    val e_tom = E_Book("Tom Soyer", "Mark Twain", 1976, 100)

    println("${e_tom.description().first} of ${e_tom.description().second}")
    println(e_tom.fullDescription())
    e_tom.printUrl()

    println(e_tom.canBorrow(3))

    e_tom.tornPages(2)
    println(e_tom.getWeight())

    val puppy = Puppy("Bobik")

    while (e_tom.pages > 0) {

        puppy.playWithBook(e_tom)

        println(e_tom.getWeight())
    }

}
