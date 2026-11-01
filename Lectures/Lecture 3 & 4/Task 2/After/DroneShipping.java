public class DroneShipping implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return (weight * 70) + 100;
    }
}