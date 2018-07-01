package udacityCourse.aquarium

fun main(args: Array<String>) {

    val a1 = buildAquarium()

    printAquarium(a1)

    a1.volume = 200

    printAquarium(a1)

    val smallAquarium = Aquarium(width = 25, height = 40, length = 50)

    printAquarium(smallAquarium)

    val aquariumWithFish = Aquarium(numberOfFish = 58)

    printAquarium(aquariumWithFish)

    makeFish()

}

fun buildAquarium(): Aquarium {

    return Aquarium()
}

fun printAquarium(a: Aquarium) = println("L = ${a.length}, h = ${a.height}, w = ${a.width}. " +
        "Volume = ${a.volume} water: ${a.getWaterLevel()} fish=$")


fun makeFish() {

    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

