class Part1 {
    fun calculate(target: Int): Int {
        var x = 0
        var y = 0
        var i = 1
        while (i < target) {
            val position = getNextPosition(x, y)
            x = position.x
            y = position.y

            i++
        }

        return Math.abs(x) + Math.abs(y)
    }

    fun getNextPosition(x: Int, y: Int): Coordinates {
        // move right
        if (y <= 0 && x <= -y && y <= x) {
            return Coordinates(x + 1, y)
        }

        // move up
        if (x > 0 && y < x) {
            return Coordinates(x, y + 1)
        }

        // move left
        if (y > 0 && -x < y) {
            return Coordinates(x - 1, y)
        }

        return Coordinates(x, y - 1)
    }
}

data class Coordinates(val x: Int, val y: Int)

fun main(args: Array<String>) {
    val part1 = Part1()
    println(part1.calculate(277678))
}