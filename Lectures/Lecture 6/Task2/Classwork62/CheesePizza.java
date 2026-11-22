package ClassWork62;

class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return wrappedPizza.getDescription() + " + Extra Cheese";
    }
    public double getCost() {
        return wrappedPizza.getCost() + 40.0;
    }
}
