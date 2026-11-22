package ClassWork62;

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new PlainPizza();

        pizza1 = new CheeseTopping(pizza1);
        pizza1 = new MushroomTopping(pizza1);
        pizza1 = new StuffedCrustDecorator(pizza1);

        System.out.println("Welcome To Saikatt's Pizza LAb");

        System.out.println("Pizza 1: " + pizza1.getDescription());
        System.out.println("Cost: BDT-/" + pizza1.getCost() + "TK");

        Pizza pizza2 = new PlainPizza();

        pizza2 = new StuffedCrustDecorator(pizza2);
        pizza2 = new CheeseTopping(pizza2);
        pizza2 = new MushroomTopping(pizza2);

        System.out.println("Pizza 2: " + pizza2.getDescription());
        System.out.println("Cost: BDT-/" + pizza2.getCost() + "TK");

    }
}