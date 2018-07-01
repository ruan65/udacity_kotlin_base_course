package udacityCourse.aquarium.generics

open class WaterSupply(var needProcessed: Boolean) {
    override fun toString(): String {
        return "WaterSupply(needProcessed=$needProcessed)"
    }
}

class TapWater(): WaterSupply(true) {

    fun addChemicalCleaners() {
        needProcessed = false
    }
}

class FishStoreWater(): WaterSupply(false)

class LakeWater(): WaterSupply(true) {
    fun filter() {
        needProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needProcessed) {"water supply need processed"}
        println("adding water from $waterSupply")
    }
}

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater()

//    val aquarium2 = Aquarium("string")
//    aquarium.waterSupply.addChemicalCleaners()

//    val aquarium3 = Aquarium(null)


}

fun main(args: Array<String>) {
    genericExample()
}