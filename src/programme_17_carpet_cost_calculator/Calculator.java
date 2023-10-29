package programme_17_carpet_cost_calculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        //Initialize the floor and carpet objects with provided values
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        //Calculate the total cost by multiplying the area of the floor with the cost of the carpet
        return floor.getArea() * carpet.getCost();
    }

}
