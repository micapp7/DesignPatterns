package starbuzz;


public class Mocha extends CondimentDecorator { // Remember CondimentDecorator extends Beverage.

    public Mocha(Beverage beverage) {
        this.beverage = beverage; // sets the beverage we are wrapping.
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // include each item decorating the beverage.
    }

    @Override
    public double getCost() {
        // delegate the call to the object we're decorating to compute cost; then, we add the cost of <decorator> to result
        return beverage.getCost() + .20;
    }
}
