public class SoyMilk extends Ingredient {

    public SoyMilk(Coffee coffee) {
        super(coffee, "Soy Milk", 3.33);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " + soy milk";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 3.50;
    }
}
