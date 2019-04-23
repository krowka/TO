public class PlainCoffee implements Coffee {
    private String description;
    private double cost;

    public PlainCoffee(String type, double cost) {
        this.description = type;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
