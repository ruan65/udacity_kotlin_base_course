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
//        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(toThe: String?) {
        when (toThe) {
            "n" -> move(north)
            "s" -> move(south)
            "w" -> move(west)
            "e" -> move(east)
            else -> move(end)
        }
    }
}






fun main(args: Array<String>) {

    val game = Game()


    while (true) {

        println("Enter move\n")

        game.makeMove(readLine())

        if (game.path.last() == Directions.END) break
    }

    game.path.clear()
}