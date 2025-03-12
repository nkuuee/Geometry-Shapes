import java.util.Random;

public class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(10);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
        double length = random.nextDouble(10);
        double width = random.nextDouble(10);
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
}
