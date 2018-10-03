package starbuzz;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };
    private Size size = Size.TALL;
    String description = "Unknown Beverage";


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }
    
    public abstract double getCost();
}
