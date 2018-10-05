package chocolatefactory;

/**
 * Singleton Pattern
 * ensures a class has only one instance, and provides a global point of access to it.
 */

public class ChocolateBoilerClient {
    public static void main(String[] args) {

        // Both engineers are accessing the same Chocolate Boiler.
        System.out.println("Engineer 1...");
        ChocolateBoiler boilerEngineer1 = ChocolateBoiler.getInstance();
        boilerEngineer1.fill();
        boilerEngineer1.boil();
        boilerEngineer1.drain();

        System.out.println();

        System.out.println("Engineer 2...");
        ChocolateBoiler boilerEngineer2 = ChocolateBoiler.getInstance();
        boilerEngineer2.drain();
        boilerEngineer2.boil();
        boilerEngineer2.fill();
        boilerEngineer2.boil();
        boilerEngineer2.drain();

    }
}
