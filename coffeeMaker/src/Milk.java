public class Milk extends Ingredient {

    public Milk(Coffee coffee) {
        super(coffee, "Milk", 1.00);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " + milk";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 1.00;
    }
}
