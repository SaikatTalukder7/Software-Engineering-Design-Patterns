package ClassWork62;

class StuffedCrustDecorator extends ToppingDecorator {

    public StuffedCrustDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return wrappedPizza.getDescription() + " + Stuffed Crust";
    }
    public double getCost() {
        return wrappedPizza.getCost() * 1.15;
    }
}