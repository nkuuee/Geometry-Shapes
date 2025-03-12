import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeUtilTest {

    @Test
    void calculateArea() {
        Shape[] shapes = {new Circle("Circle", 2.0),
                new Square("Square", 2.0),
                new Rectangle("Rectangle", 20.0, 14.0)};

        ShapeUtil shapeUtil = new ShapeUtil();
        double area = shapeUtil.calculateArea(shapes);
        assertEquals(296.56, area, 0.01);
    }

    @Test
    void calculatePerimeter() {
        Shape[] shapes = {new Circle("Circle", 2.0),
                new Square("Square", 2.0),
                new Rectangle("Rectangle", 20.0, 14.0)};

        ShapeUtil shapeUtil = new ShapeUtil();
        double perimeter = shapeUtil.calculatePerimeter(shapes);
        assertEquals(88.56, perimeter, 0.01);
    }

}
