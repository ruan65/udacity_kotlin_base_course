import java.util.*

val intArr = arrayOf(11,12,13,14,15)
var strList = arrayListOf<String>()



fun main(args: Array<String>) {

    for (i in intArr) {
        strList.add(i.toString())
    }

    println(strList)
}