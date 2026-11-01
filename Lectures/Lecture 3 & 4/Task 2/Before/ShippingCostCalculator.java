public class ShippingCostCalculator {

    public double calculateCost(String shippingType, double weight) {

        if (shippingType.equals("STANDARD")) {
            return weight * 10;
        }
        else if (shippingType.equals("EXPRESS")) {
            return weight * 25;
        }
        else if (shippingType.equals("OVERNIGHT")) {
            return weight * 50;
        }
        return 0;
    }
}