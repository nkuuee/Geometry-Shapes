public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return (length + width) * 2;
    }

}
