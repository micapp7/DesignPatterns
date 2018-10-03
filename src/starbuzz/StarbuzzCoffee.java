package starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getSize() + " " + beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage2 = new DarkRoast(); // Make a DarkRoast Object
        beverage2 = new Mocha(beverage2); // Wrap it with a Mocha
        beverage2 = new Mocha(beverage2); // Wrap it in a second Mocha
        beverage2 = new Whip(beverage2); // Wrap it in a Whip
        System.out.println(beverage2.getSize() + " " + beverage2.getDescription() + " $" + beverage2.getCost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getSize() + " " + beverage3.getDescription() + " $" + beverage3.getCost());

        // Test condiment price based on size
        Beverage beverage4 = new Espresso();
        beverage4.setSize(Beverage.Size.GRANDE);
        beverage4 = new Soy(beverage4);

        System.out.println(beverage4.getSize() + " " + beverage4.getDescription() + " $" + beverage4.getCost());

    }
}
