public class Chocolate extends Ingredient {

    public Chocolate(Coffee coffee) {
        super(coffee, "Chocolate", 1.25);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " + chocolate";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 1.25;
    }

}
