import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Part1Test {

    @Test
    fun calculate() {
        // Arrange
        val part1 = Part1()

        // Act
        val test1 = part1.calculate(1)
        val test2 = part1.calculate(12)
        val test3 = part1.calculate(23)
        val test4 = part1.calculate(1024)

        // Assert
        kotlin.test.assertEquals(0, test1)
        kotlin.test.assertEquals(3, test2)
        kotlin.test.assertEquals(2, test3)
        kotlin.test.assertEquals(31, test4)
    }
}
