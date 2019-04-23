public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Coffee coffee = coffeeMaker.makeCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
