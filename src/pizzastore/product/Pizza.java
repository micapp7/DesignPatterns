package pizzastore.product;

import pizzastore.product.ingredient.*;

/**
 * The Product Class
 * abstract product that is produced by the Creator class (Pizza Store)
 * concrete pizza classes depend on this class (abstraction) because they implement the interface.
 */

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Meat[] meat;
    Clams clam;

    // Subclasses will collect the ingredient needed for the pizza.
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
