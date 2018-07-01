package udacityCourse.spices

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00),
    GRAY(0x999999)
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

object GraySpiceColor : SpiceColor {
    override val color = Color.GRAY
}

object RedSpiceColor : SpiceColor {
    override val color = Color.RED
}

sealed class Spice(val name: String, val spiciness: String = "mild") : Grinder, SpiceColor {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 4
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()

    override fun toString(): String {
        return "Spice(name='$name', spiciness='$spiciness')"
    }

    override fun grind() {
        println("is not supposed to be grind")
    }
}

class Curry(spiciness: String) : Spice("curry", spiciness), SpiceColor by YellowSpiceColor {
    override fun grind() {
        println("Grinding curry")
    }

    override fun prepareSpice() {
        grind()
    }
}

class Pepper(spiciness: String) : Spice("pepper", spiciness), SpiceColor by GraySpiceColor {
    override fun grind() {
        println("Grinding pepper")
    }

    override fun prepareSpice() {
        println("Prepare Pepper")
    }
}

class Cayenne(spiciness: String) : Spice("cayenne", spiciness), SpiceColor by RedSpiceColor {

    override fun prepareSpice() {
        println("Prepare Pepper")
    }
}

val spices1: List<Spice> = listOf(
        Curry("mild"),
        Pepper("medium"),
        Cayenne("spicy")

//        Spice("pepper", "medium"),
//        Spice("cayenne", "spicy"),
//        Spice("ginger", "mild"),
//        Spice("red curry", "medium"),
//        Spice("green curry", "mild"),
//        Spice("hot pepper", "extremely spicy")
)

data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}

fun main(args: Array<String>) {

    val filteredSpices = spices1.filter { it.heat < 5 }

    println(filteredSpices)

    filteredSpices.map {
        it.grind()
        println(it.color.rgb)
    }

    println("\nSpice containers\n")

    val spiceContainerList: List<SpiceContainer> = spices1.map { SpiceContainer(it) }

    spiceContainerList.map { it -> println(it.label) }

}
