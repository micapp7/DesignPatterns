package pizzastore.factory;

import pizzastore.product.Pizza;
import pizzastore.product.PizzaType;

/**
 * The Creator Class
 * defines an abstract factory method that the subclasses implement to produce products.
 * contains code that depends on an abstract product, which is produced by the subclass.
 * applies the dependency inversion principle - depend upon abstractions not concrete classes.
 */

public abstract class PizzaStore {

    // Client code
    // well-honored order system that needs to stay the same regardless of franchise.
    // final enforces that this method is not change by subclass.
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza; // abstract dependency

        pizza = createPizza(type); // Calls the createPizza method on the concrete subclass and returns a pizza object

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Factory method that produces a Pizza object
    // Let each subclass define what type of pizza to create.
    // This decouples the client code in the super class from the object creation code in the subclass.
    // --Isolates the code in the superclass, like orderPizza(), from knowing what kind of concrete product is created.
    protected abstract Pizza createPizza(PizzaType type);

}
