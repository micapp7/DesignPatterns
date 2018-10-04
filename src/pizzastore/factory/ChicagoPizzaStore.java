package pizzastore.factory;

import pizzastore.product.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType item) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        switch (item) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                return pizza;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                return pizza;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                return pizza;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                return pizza;
            default:
                return null;
        }
    }
}
