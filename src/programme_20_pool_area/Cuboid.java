package programme_20_pool_area;

public class Cuboid extends Rectangle {
    private final double height; //Instance variable to store the height of the cubid

    public Cuboid(double width, double length, double height) {
        super(width, length); // Call the constructor the class rectangle to set the width and length
        this.height = height < 0 ? 0 : height; //Constructor to initialize the height, ensuring its non-negative
    }

    public double getHeight() {
        return height; //getter method to retrive the value of the height
    }

    public double getVolume() {
        return getArea() * height; // method to calculate and return the volume of cuboid
    }
}
