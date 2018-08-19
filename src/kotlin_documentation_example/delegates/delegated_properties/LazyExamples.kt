package kotlin_documentation_example.delegates.delegated_properties

val lazyVal: String by lazy(LazyThreadSafetyMode.NONE) {
    println("lazyVal computed")
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyVal)
    println(lazyVal)
}