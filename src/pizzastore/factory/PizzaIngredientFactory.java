package pizzastore.factory;

import pizzastore.product.ingredient.*;

/**
 * Abstract Factory
 * provides an interface for creating families of related or dependent products (objects) without specifying their concrete classes
 * subclasses define how products are produced
 *
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Meat[] createMeat();
    Clams createClams();
}
