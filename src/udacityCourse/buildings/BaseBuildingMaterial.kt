package udacityCourse.buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}
class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}


class Building<out T : BaseBuildingMaterial>(val buildingMaterial: T) {
    var baseMaterialsNeeded = 100
    var actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    println((if (building.actualMaterialsNeeded < 500) "Small" else "Large") + " building")
}

fun main(args: Array<String>) {
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    isSmallBuilding(woodBuilding)

    isSmallBuilding(Building(Brick()))
}
