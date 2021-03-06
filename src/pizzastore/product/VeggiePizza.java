package pizzastore.product;

import pizzastore.factory.PizzaIngredientFactory;

/**
 * the only difference between pizzas in different regions are the ingredient
 * the ingredient factory is going to handle the regional differences for us
 */

public class VeggiePizza extends Pizza{
    private PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}

