import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void testCalculateArea() {
        Square square = new Square("Square", 2);
        double expected = 4;
        double actual = square.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testCalculatePerimeter() {
        Square square1 = new Square("Perimeter", 2);
        double expected = 8;
        double actual = square1.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }
}
