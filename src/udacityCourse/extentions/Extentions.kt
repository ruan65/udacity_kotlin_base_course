package udacityCourse.extentions

fun String.hasSpaces() = find { it == ' ' } != null

fun <T>MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

class B(val descr: String) {
    override fun toString(): String {
        return "B(descr='$descr')"
    }
}

fun main(args: Array<String>) {
    val has = "hell o".hasSpaces()

    println("has spaces: ${has}")


    val l1 = mutableListOf<Int>(1, 2, 3)

    println(l1)

    l1.swap(0,2)


    println(l1)

    var b: B? = B("This is b class")

    b = null

    b = B("New b class")

    println(b.toString())

    println(l1.lastIndex)
}
