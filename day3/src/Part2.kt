const val KEY_FORMAT: String = "%s:%s"

class Part2 {

    var map = HashMap<String, Int>()

    fun calculate(target: Int): Int {
        var x = 0
        var y = 0
        var i = 1
        while (true) {
            val total = getNearbyValues(x, y)

            map.put(KEY_FORMAT.format(x, y), total)

            if (i == 1) {
                map.put(KEY_FORMAT.format(x, y), 1)
            }

            if (total > target) {
                return total
            }

            val position = getNextPosition(x, y)
            x = position.x
            y = position.y
            i++
        }
    }

    private fun getNextPosition(x: Int, y: Int): Coordinates {
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

    private fun getNearbyValues(x: Int, y: Int): Int {
        return  map.getOrDefault(KEY_FORMAT.format(x - 1, y - 1), 0) +
                map.getOrDefault(KEY_FORMAT.format(x - 1, y), 0) +
                map.getOrDefault(KEY_FORMAT.format(x - 1, y + 1), 0) +
                map.getOrDefault(KEY_FORMAT.format(x, y - 1), 0) +
                map.getOrDefault(KEY_FORMAT.format(x, y + 1), 0) +
                map.getOrDefault(KEY_FORMAT.format(x + 1, y - 1), 0) +
                map.getOrDefault(KEY_FORMAT.format(x + 1, y), 0) +
                map.getOrDefault(KEY_FORMAT.format(x + 1, y + 1), 0)
    }
}

fun main(args: Array<String>) {
    val part2 = Part2()
    println(part2.calculate(277678))
}