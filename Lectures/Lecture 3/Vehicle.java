public abstract class Vehicle
{
    protected String vehicleId;

    public Vehicle(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public abstract double calculateRentalCost(int days);

    public void printRentalDetails(int days, double cost)
    {
        System.out.println("ID: " + vehicleId);
        System.out.println("Days: " + days + " Days");
        System.out.println("Rental Cost: " + cost);
        System.out.println();
    }
}