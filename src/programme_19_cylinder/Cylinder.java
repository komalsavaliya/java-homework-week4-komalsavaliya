package programme_19_cylinder;

public class Cylinder extends Circle {
    private final double height;//Instance variable to store the height of cylinder

    public Cylinder(double radius, double height) {
        super(radius);//Calls the constructor of the class circle to set the radius
        this.height = height < 0 ? 0 : height;//Constructor to initilize the height, ensuring it is non negative
    }

    public double getHeight() {
        return height;//Getter method to retrieve the value of the height
    }

    public double getVolume() {
        return getArea() * height;//Method to calculate and return the volume of the Cylinder
    }

}
