package pizzastore.factory;

import pizzastore.product.ingredient.*;

  public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Meat[] createMeat() {
        return new Meat[]{new SlicedPepperoni()};
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
