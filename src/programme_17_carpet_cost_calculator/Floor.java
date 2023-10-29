package programme_17_carpet_cost_calculator;

/**
 * 17. Carpet Cost Calculator (Create package name ‘carpet_cost_calculator’ and create all
 * below classes in this package)
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for
 * rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the
 * price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
 * meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
 * would cost $960.
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * PRIME TESTING
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area (width
 * * length).
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getCost without any parameters, it needs to return the value of cost field
 * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 * and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters, it needs to return the calculated total
 * cost to cover the floor with a carpet.
 * 4. Write a class with the name Main. The class needs to have a main method.
 * TEST EXAMPLE
 * → TEST CODE: Write below code in main method
 * Carpet carpet = new Carpet(3.5);
 * Floor floor = new Floor(2.75, 4.0);
 * Calculator calculator = new Calculator(floor, carpet);
 * System.out.println("total= " + calculator.getTotalCost());
 * carpet = new Carpet(1.5);
 * PRIME TESTING
 * floor = new Floor(5.4, 4.5);
 * calculator = new Calculator(floor, carpet);
 * System.out.println("total= " + calculator.getTotalCost());
 * → OUTPUT
 * total= 38.5
 * total= 36.45
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 4 classes.
 */
public class Floor {
    //Instance variable to store width and length of Floor
    private double width;
    private double length;

    //Constructor to initialize the width and length, ensuring they are non-negative
    public Floor(double width,double length){
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
    //Method to calculate and return the area of the floor
    public double getArea(){
        return width * length;
    }
}
