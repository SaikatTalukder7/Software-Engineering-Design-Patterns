public class Main
{

    public static void main(String[] args)
    {

        double weight = 5;

        ShippingStrategy standard =
            new StandardShipping();

        ShippingStrategy express =
            new ExpressShipping();

        ShippingStrategy overnight =
            new OvernightShipping();

        ShippingStrategy drone =
            new DroneShipping();

        System.out.println("Standard Shipping Cost: "
                           + standard.calculateCost(weight));

        System.out.println("Express Shipping Cost: "
                           + express.calculateCost(weight));

        System.out.println("Overnight Shipping Cost: "
                           + overnight.calculateCost(weight));

        System.out.println("Drone Shipping Cost: "
                           + drone.calculateCost(weight));
    }
}
