package udacityCourse.aquarium

import kotlin.math.PI

open class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100): Any() {

    constructor(numberOfFish: Int): this() {

        val water = numberOfFish * 2000 // cm3
        val tank = water * 1.1
        height = (tank / length / width).toInt()
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = value * 1000 / (width * length)
        }

    open fun getWaterLevel() = volume * .9
}

class TowerTank(): Aquarium() {

    override fun getWaterLevel() = volume * .8

    override var volume: Int
        get() = width * height * length / (1000 * PI.toInt())
        set(value) {
            height = value * 1000 /(width * length)
        }
}