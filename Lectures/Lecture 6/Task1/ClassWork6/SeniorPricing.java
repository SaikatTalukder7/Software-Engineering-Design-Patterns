package ClassWork6;

class SeniorPricing implements PricingStrategy {

    public double calculatePrice(double basePr) {
        return basePr*0.70;
    }
}