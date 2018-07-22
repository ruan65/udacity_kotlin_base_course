package kotlin_documentation_example.delegates

enum class Nationality {
    Russian, English, Spanish, Japanese
}

interface Greeting {
    fun greeting(nationality: Nationality, native: Boolean = false)
}

class Speech(val nationality: Nationality): Greeting {
    override fun greeting(nationality: Nationality, native: Boolean) {

        when (nationality) {
            Nationality.Russian -> println("Привет!")
            Nationality.Japanese -> println("Kon'nichiwa!")
            Nationality.Spanish -> println("Hola!")
            else -> print("Hi")
        }
    }
}

class Human(val nationality: Nationality, val speech: Speech? = null) {

    var foreignLanguage: Nationality? = null

    fun greeting(native: Boolean = false) = speech?.greeting(if (native) nationality else foreignLanguage ?: nationality)
}

fun main(args: Array<String>) {

    val russian = Human(Nationality.Russian, Speech(Nationality.Russian))

    russian.greeting()

    russian.foreignLanguage = Nationality.English

    russian.greeting(true)


}