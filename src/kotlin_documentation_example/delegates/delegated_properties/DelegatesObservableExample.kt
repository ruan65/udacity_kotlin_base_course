package kotlin_documentation_example.delegates.delegated_properties

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("no name") {
        pr, old, new -> println("$pr $old ---> $new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    println(user.name)

    user.name = "Sasha"

    println(user.name)

    user.name = "Zina"
    println(user.name)

    user.name = "Rasul"

    println(user.name)
}