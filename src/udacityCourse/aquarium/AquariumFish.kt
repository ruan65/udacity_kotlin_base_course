package udacityCourse.aquarium

abstract class AquariumFish {
//    abstract val color: String
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

object GrayColor: FishColor {
    override val color = "gray"
}

class Shark: AquariumFish(), FishAction, FishColor by GrayColor {

//    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): AquariumFish(),
        FishAction by PrintingFishAction("a lot of algae"),
        FishColor by fishColor

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}