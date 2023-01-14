public class Cuboid extends Rectangle {

    // Instance Field.
    private double height;

    // Parameterized Constructor.
    public Cuboid (double width, double length, double height) {
        super(width, length);

        // Checks for invalid value.
        this.height = (height < 0) ? 0 : height;
    }

    // Getter method.
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
