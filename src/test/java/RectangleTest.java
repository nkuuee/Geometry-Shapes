import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle("Square", 20, 14);
        double expected = 280;
        double actual = rectangle.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testCalculatePerimeter() {
        Rectangle rectangle1 = new Rectangle("Perimeter", 20, 14);
        double expected = 68;
        double actual = rectangle1.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }


}
