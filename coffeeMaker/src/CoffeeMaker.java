import java.util.Scanner;

public class CoffeeMaker {
    private Coffee coffee;
    private Scanner scanner = new Scanner(System.in);

    public Coffee makeCoffee() {
        selectBase();
        selectIngredients();
        return coffee;
    }

    private void selectBase() {
        System.out.println("Choose your coffee base:\n[1] Dark Roast\n[2] Decaf\n[3] Espresso\n[4] House Blend");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                coffee = new DarkRoast("Dark Roast", 5.50);
                break;
            case 2:
                coffee = new Decaf("Decaf", 4.75);
                break;
            case 3:
                coffee = new Espresso("Espresso", 6.00);
                break;
            case 4:
                coffee = new HouseBlend("House Blend", 5.00);
                break;
            default:
                System.out.format("Couldn't recognize option %d\n", option);
                System.exit(-1);
        }
    }

    private void selectIngredients() {
        int option;
        do {
            System.out.println("Customize your coffee:\n[1] Add Chocolate\n[2] Add Cinnamon\n" +
                    "[3] Add Milk\n[4] Add Soy Milk\n[0] Finish");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    coffee = new Chocolate(coffee);
                    break;
                case 2:
                    coffee = new Cinnamon(coffee);
                    break;
                case 3:
                    coffee = new Milk(coffee);
                    break;
                case 4:
                    coffee = new SoyMilk(coffee);
                    break;
                default:
                    System.out.format("Couldn't recognize option %d\n", option);
            }
        } while (option != 0);
    }
}
