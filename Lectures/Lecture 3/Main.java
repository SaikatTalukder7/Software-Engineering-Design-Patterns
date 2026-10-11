public class Main
{
    public static void main(String[] args)
    {

        Vehicle[] vehicles =
        {
            new Car("skt7", 1500),
            new Bike("skt10", 1000),
            new LuxuryCar("super10", 5000, 2000)
        };

        int[] days = {3, 7, 2};

        for (int i = 0; i < vehicles.length; i++)
        {
            double cost = vehicles[i].calculateRentalCost(days[i]);
            vehicles[i].printRentalDetails(days[i], cost);
        }
    }
}