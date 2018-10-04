package pizzastore.factory;

import pizzastore.product.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType item) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                return pizza;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                return pizza;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                return pizza;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                return pizza;
            default:
                return null;
        }
    }
}
