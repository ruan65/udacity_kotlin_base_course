package kotlin_documentation_example.delegates.delegated_properties

import kotlin.reflect.KProperty

class Example {
    var p: String by SomeDelegateClass()
}

class SomeDelegateClass {
    operator fun getValue(a : Any?, property: KProperty<*>): String {

        return "$a, thank you for delegating '${property.name} to me!'"
    }

    operator fun setValue(b: Any?, property: KProperty<*>, s: String) {

        println("$s has been assigned to '${property.name}' in $b.")

    }

}

fun main(args: Array<String>) {
    val e = Example()

    println(e.p)

    e.p = "'New value of p'"
}