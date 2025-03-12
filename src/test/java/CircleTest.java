import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testCalculateArea() {
        Circle circle = new Circle("Area", 2);
        double expected = 12.56;
        double actual = circle.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testCalculatePerimeter() {
        Circle circle1 = new Circle("Perimeter", 2);
        double expected = 12.56;
        double actual = circle1.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }
}
