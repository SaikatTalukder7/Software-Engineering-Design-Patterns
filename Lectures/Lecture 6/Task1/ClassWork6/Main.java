package ClassWork6;

public class Main {

    public static void main(String[] args) {

        double basePr = 500.0;

        TicketBooking booking =new TicketBooking(new RegularPricing());
        System.out.println("Regular Price: "+ "BDT-/"+ booking.getFinalPrice(basePr) + "Tk");

        booking.setStrategy(new StudentPricing());
        System.out.println("Student Price: "+ "BDT-/" + booking.getFinalPrice(basePr) + "Tk");

        booking.setStrategy(new SeniorPricing());
        System.out.println("Senior Price: "+ "BDT-/" + booking.getFinalPrice(basePr) + "Tk");

        booking.setStrategy(new GroupPricing(12));
        System.out.println("Group Price: "+ "BDT-/" + booking.getFinalPrice(basePr) + "Tk");
    }
}