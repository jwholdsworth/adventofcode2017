import static org.junit.jupiter.api.Assertions.*;

class Part1Test {

    @org.junit.jupiter.api.Test
    void calculateLineChecksum() {
        // Arrange
        Part1 p1 = new Part1();

        // Act
        int checksum1 = p1.calculateLineChecksum("5\t1\t9\t5");
        int checksum2 = p1.calculateLineChecksum("7\t5\t3");
        int checksum3 = p1.calculateLineChecksum("2\t4\t6\t8");

        // Assert
        assertEquals(8, checksum1);
        assertEquals(4, checksum2);
        assertEquals(6, checksum3);
    }
}