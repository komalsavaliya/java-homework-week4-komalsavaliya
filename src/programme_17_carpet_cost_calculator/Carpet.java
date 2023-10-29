package programme_17_carpet_cost_calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
// Ensure that cost is non-negative
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

}

