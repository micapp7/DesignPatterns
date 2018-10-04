package pizzastore.factory;

import pizzastore.product.ingredient.PlumTomatoSauce;
import pizzastore.product.ingredient.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    @Override
    public Meat[] createMeat() {
        Meat[] meat = {new SlicedPepperoni()};
        return meat;
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }
}
