import static org.junit.jupiter.api.Assertions.*;

class Part2Test {

    @org.junit.jupiter.api.Test
    void calculateDivisibleValuesOnLine() {
        // Arrange
        Part2 p2 = new Part2();

        // Act
        int checksum1 = p2.calculateDivisibleValuesOnLine("5\t9\t2\t8");
        int checksum2 = p2.calculateDivisibleValuesOnLine("9\t4\t7\t3");
        int checksum3 = p2.calculateDivisibleValuesOnLine("3\t8\t6\t5");

        // Assert
        assertEquals(4, checksum1);
        assertEquals(3, checksum2);
        assertEquals(2, checksum3);
    }
}