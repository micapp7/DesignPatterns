package starbuzz;


public class Whip extends CondimentDecorator { // Remember CondimentDecorator extends Beverage.
    public Whip(Beverage beverage) {
        this.beverage = beverage; // sets the beverage we are wrapping.
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip"; // include each item decorating the beverage.
    }

    @Override
    public double getCost() {
        // delegate the call to the object we're decorating to compute cost; then, we add the cost of <decorator> to result
        return beverage.getCost() + .10;
    }
}
