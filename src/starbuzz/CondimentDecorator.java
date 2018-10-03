package starbuzz;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription(); // require that all condiment decorators reimplement the getDescription()

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}

