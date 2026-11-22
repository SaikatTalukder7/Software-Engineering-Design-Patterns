package ClassWork62;

class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return wrappedPizza.getDescription() + " + Mushroom";
    }
    public double getCost() {
        return wrappedPizza.getCost() + 30.0;
    }
}