import java.util.Random;

public class ShapeUtil {
    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(10.0);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10.0);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
        double length = random.nextDouble(10.0);
        double width = random.nextDouble(10.0);
        return new Rectangle("Rectangle", length, width);
    }

    public Shape createRandomShape() {
        int randomizer = random.nextInt(2);

        switch (randomizer) {
            case (0) -> {
                return createRandomCircle();
            }
            case (1) -> {
                return createRandomSquare();
            }
            case (2) -> {
                return createRandomRectangle();
            }
            default -> throw new
                    IllegalStateException("Unexpected value: " + randomizer);
        }

    }

    public double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    class ShapeUtilDemo {
        public static void main(String[] args) {
            ShapeUtil shapeUtil = new ShapeUtil();

            Shape circle = shapeUtil.createRandomCircle();
            double circleArea = shapeUtil.calculateArea(circle);
            double circlePerimeter = shapeUtil.calculatePerimeter(circle);
            System.out.println("Circle area = " + circleArea);
            System.out.println("Circle perimeter = " + circlePerimeter);
            System.out.println('\n');

            Shape square = shapeUtil.createRandomSquare();
            double squareArea = shapeUtil.calculateArea(square);
            double squarePerimeter = shapeUtil.calculatePerimeter(square);
            System.out.println("Square area = " + squareArea);
            System.out.println("Square perimeter = " + squarePerimeter);
            System.out.println('\n');

            Shape rectangle = shapeUtil.createRandomRectangle();
            double rectangleArea = shapeUtil.calculateArea(rectangle);
            double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
            System.out.println("Rectangle area = " + rectangleArea);
            System.out.println("Rectangle perimeter = " + rectanglePerimeter);
        }

    }
}
