package ClassWork6;

class GroupPricing implements PricingStrategy {
    private int GS;
    public GroupPricing(int GS) {
        this.GS = GS;
    }
    public double calculatePrice(double basePr) {
        double discount= GS* 0.05;
        if (discount>0.40){
            discount=0.40;
        }
        return basePr*(1-discount);
    }
}