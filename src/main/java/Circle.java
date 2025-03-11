public class Circle extends Shape {
    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateSquare() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
