package pizzastore;

public class CaliforniaPepperoniPizza extends Pizza{
    public CaliforniaPepperoniPizza() {
        name = "California Style Sauce and Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
