package kotlin_documentation_example.delegates

interface Printer {
    val message: String
    fun print()
    fun printBullShit()
}

class PrinterImpl(val x: Int): Printer {

    override val message = "This is message"

    override fun printBullShit() {
        println("lsfjnapdjwd;cikasdijasdicjsdcpiadsjcapsdicjads")
    }

    override fun print() {
        println(x)
    }
}

class Texter(b: Printer) : Printer by b

class TexterOver(b: Printer) : Printer by b {

    override val message = "TexterOver message"

    override fun printBullShit() {
        println("This is fucking bullshit")
    }
}


fun main(args: Array<String>) {

    val b = PrinterImpl(333)

    val texter = Texter(b)
    texter.print()
    texter.printBullShit()

    val texterOver = TexterOver(b)
    texterOver.print()
    texterOver.printBullShit()


    println(b.message)
    println(texter.message)
    println(texterOver.message)
}