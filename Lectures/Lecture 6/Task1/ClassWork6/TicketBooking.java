package ClassWork6;

class TicketBooking {
    private PricingStrategy SaikatStrategy;
    public TicketBooking(PricingStrategy SaikatStrategy) {
        this.SaikatStrategy = SaikatStrategy;
    }
    public void setStrategy(PricingStrategy SaikatStrategy) {
        this.SaikatStrategy = SaikatStrategy;
    }
    public double getFinalPrice(double basePr) {
        return SaikatStrategy.calculatePrice(basePr);
    }
}