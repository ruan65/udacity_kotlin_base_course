package kotlin_documentation_example.functions

fun hello(greeting: String, x: Int = 1, y: Int = 3, lmbd: () -> Unit) {
    lmbd()

    println("x = $x, y = $y, greeting is '$greeting'")
}

fun variousNumOfArgsStrings(vararg strings: String) {

    strings.forEach { println(it) }
}

fun variousNumOfArgsInts(vararg numbers: Int) {

    numbers.forEach { println(it) }
}

fun main(args: Array<String>) {
    hello("Hi brother") {
        println("this is lambda")
    }

    variousNumOfArgsStrings("1","2")
    variousNumOfArgsStrings(*arrayOf("1","5"))

    variousNumOfArgsInts(1,2,3)
    variousNumOfArgsInts(*intArrayOf(555,666,777))
}