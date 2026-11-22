package ClassWork6;

class StudentPricing implements PricingStrategy {

    public double calculatePrice(double basePr) {
        return basePr*0.80;
    }
}