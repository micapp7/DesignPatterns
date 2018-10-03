package starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return .99;
    }
}
