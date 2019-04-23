public class Cinnamon extends Ingredient {

    public Cinnamon(Coffee coffee) {
        super(coffee, "Cinnamon", 1.50);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + cinnamon";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.50;
    }
}
