package pizzastore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("pepperoni");
        System.out.println("Johnny ordered a " + pizza.getName() + "\n");

    }
}
