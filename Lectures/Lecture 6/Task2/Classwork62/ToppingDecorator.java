package ClassWork62;

abstract class ToppingDecorator implements Pizza {
    protected Pizza wrappedPizza;
    public ToppingDecorator(Pizza pizza){
        this.wrappedPizza = pizza;
    }
}