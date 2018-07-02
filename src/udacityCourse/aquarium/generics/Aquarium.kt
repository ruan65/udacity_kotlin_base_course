package udacityCourse.aquarium.generics

open class WaterSupply(var needProcessed: Boolean) {
    override fun toString(): String {
        return "WaterSupply(needProcessed=$needProcessed)"
    }
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

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

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {

        if (waterSupply.needProcessed) {
            cleaner.clean(waterSupply)
        }
        check(!waterSupply.needProcessed) {"water supply need processed"}
        println("adding water from $waterSupply")
    }

    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R

//    fun printAquarium(ws: T) {
//        println("Aquarium with $ws")
//    }
}

fun <T: WaterSupply>isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needProcessed}")
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

fun genericExample() {
    val tapWater = TapWater()
    val aquarium = Aquarium(tapWater)
    addItemTo(aquarium)

    println("tap water is type of tapWater: " + tapWater.isOfType<TapWater>())

//    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater(TapWaterCleaner())

//    val aquarium2 = Aquarium("string")
//    aquarium.waterSupply.addChemicalCleaners()

//    val aquarium3 = Aquarium(null)


    isWaterClean(aquarium)

    println(aquarium.hasWaterSupplyOfType<LakeWater>())


}

fun main(args: Array<String>) {
    genericExample()
}