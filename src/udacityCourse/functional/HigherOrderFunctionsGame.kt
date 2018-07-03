package udacityCourse.functional

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val west = { path.add(Directions.WEST) }
    val east = { path.add(Directions.EAST) }

    val end = {
        path.add(Directions.END)
        println("Game over: $path")
        path.clear()
        println(path)
        false
    }
}






fun main(args: Array<String>) {
    val game = Game()

    println(game.path)

    game.north()
    game.east()
    game.south()
    game.west()

    println(game.path)

    var isEnded = game.end()

    println("Is game active: $isEnded")

}