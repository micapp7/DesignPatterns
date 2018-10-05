package chocolatefactory;

public class ChocolateBoiler {
    // volatile keyword ensures that multiple threads handle the unique instance variable correctly when it is being
    // initialized to the Singleton instance.
    private volatile static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * Multithreading can break the singleton pattern by creating multiple objects
     * The synchronize keyword can be used to ensure that only a single thread can access the method at a time
     * However, calling sychronize everytime the getInstance method is called is expensive.
     * <p>
     * Therefore, use "double-check locking" to reduce the use of synchronization.
     * first check to see if an instance is created, and if not, THEN we synchronize.
     *
     * @return unique instance.
     */

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }

        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("filling boiler with milk and chocolate mixture...");
            empty = false;
            boiled = false;
        } else {
            System.out.println("attempting to fill...boiler is empty...");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("draining boiled milk and chocolate...");
            empty = true;
        } else {
            System.out.println("attempting to drain...boiler is empty...");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("bringing contents to a boil...");
            boiled = true;
        } else {
            System.out.println("attempting to boil...boiler is either empty or already boiled...");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
