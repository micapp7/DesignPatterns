package pizzastore;

import pizzastore.factory.ChicagoPizzaStore;
import pizzastore.factory.NYPizzaStore;
import pizzastore.factory.PizzaStore;
import pizzastore.product.Pizza;
import pizzastore.product.PizzaType;

/**
 * Factory Method
 * Powerful technique for coding to abstractions and not concrete classes.
 * Uses subclasses to handle object creation which allows clients to only know the abstract type.
 * Leaves the subclass to worry about the concrete type.
 *
 * AbstractType = PizzaStore
 * ConcreteType = NYPizzaStore
 */
public class PizzaClient {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
