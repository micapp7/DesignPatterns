package pizzastore;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CaliforniaCheesePizza();
            case "pepperoni":
                return new CaliforniaPepperoniPizza();
        }
        return null;
    }
}
