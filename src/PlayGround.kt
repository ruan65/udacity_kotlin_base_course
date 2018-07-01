var nList = listOf<String?>(null, null)

var nuList: List<String>? = listOf("three", "four")

var nItn: Int? = null

var f1 = ""
val f2 = "trout"
val f3 = "el"

fun isFishNameOk(name: String) {
    when (name.length) {
        0 -> println("Inappropriate name")
        in 3..12 -> println("Good fish name")
        else -> println("Ok fish name")
    }
}


fun main(args: Array<String>) {

//    nList = listOf("one", "two")
//    println(nList)
//    println(nuList?.size)
//
//    val n = 888
//    val c = 9
//
//    println(nuList?.size  ?: "No list")
//
//    var hello = "Hell OOO"
//
//    println("$hello my little boy ${888 + 777}")
//
//    when (c) {
//        in 100..Int.MAX_VALUE -> println("norm")
//        in 0..10 -> println("search gas")
//        else -> println("Kinda")
//    }


    isFishNameOk(f1)
    isFishNameOk(f3)
    isFishNameOk(f2)

}