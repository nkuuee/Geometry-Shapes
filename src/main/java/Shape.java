abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateSquare();
    abstract double calculatePerimeter();

}
