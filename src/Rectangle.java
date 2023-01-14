public class Rectangle {

    // Instance Fields.
    private double width;
    private double length;

    // Parameterized Constructor.
    public Rectangle(double width, double length) {
        // Checks for invalid input.
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Getter methods.
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }
}
