abstract class Ingredient implements Coffee {
    protected Coffee coffee;
    protected String type;
    protected double cost;

    public Ingredient (Coffee coffee, String type, double cost){
        this.coffee = coffee;
        this.type = type;
        this.cost = cost;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();

}
