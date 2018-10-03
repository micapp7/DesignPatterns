package starbuzz;


public class Soy extends CondimentDecorator { // Remember CondimentDecorator extends Beverage.
    public Soy(Beverage beverage) {
        this.beverage = beverage; // sets the beverage we are wrapping.
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy"; // include each item decorating the beverage.
    }

    // Change condiment price based on size
    @Override
    public double getCost() {
        // delegate the call to the object we're decorating to compute cost; then, we add the cost of <decorator> to result
        double cost = beverage.getCost();

        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
