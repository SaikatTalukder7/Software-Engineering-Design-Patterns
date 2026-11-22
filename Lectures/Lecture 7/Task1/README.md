Problem: Movie Ticket Pricing System
Build a ticket-pricing Context that can switch pricing rules at runtime, with one pricing rule that
needs a constructor parameter.
● Interface PricingStrategy: calculatePrice(double basePrice) (returns double).
● Concrete strategy RegularPricing: returns basePrice unchanged.
● Concrete strategy StudentPricing: returns basePrice with a 20% discount.
● Concrete strategy SeniorPricing: returns basePrice with a 30% discount.
● Concrete strategy GroupPricing: this one has its OWN constructor taking an int
groupSize. calculatePrice() should apply a discount that SCALES with group size:
5% discount per person in the group, capped at a maximum of 40% (e.g. a group of
10 gets the 40% cap, not 50%). You must implement the capping logic yourself.
● Context class TicketBooking: constructor takes a PricingStrategy; has
setStrategy(PricingStrategy); method getFinalPrice(double basePrice) delegates to the
current strategy.
● In Main, create ONE TicketBooking object for a basePrice of 500.0, then call
getFinalPrice() four times, swapping strategy between each call (Regular, Student,
Senior, then a GroupPricing for a group of 12 people) - proving the SAME booking
object adapts to each pricing rule at runtime, and that the group discount correctly
caps at 40% for a group of 12.
