import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Part2Test {

    @Test
    fun calculate() {
        // Arrange
        val testMap = HashMap<Int, Int>()
        // target, expectedResult
        testMap.put(4, 5)
        testMap.put(23, 25)
        testMap.put(27, 54)
        testMap.put(747, 806)

        val part2 = Part2()

        // Act
        testMap.forEach() {
            part2.map.clear()
            val result = part2.calculate(it.key)

            // Assert
            kotlin.test.assertEquals(it.value, result)
        }
    }
}