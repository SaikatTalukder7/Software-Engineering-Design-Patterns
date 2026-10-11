# Task 1: Vehicle Rental Management System

Build a vehicle rental management system that rents different types of vehicles polymorphically through a single array, applying abstraction, inheritance, and method overriding.

1. Create an abstract class Vehicle with a protected field vehicleId (String) and a constructor to initialize it. Include an abstract method calculateRentalCost(int days) that returns a double. Include a concrete method printRentalDetails(int days, double cost) that prints the vehicle ID, rental duration, and total rental cost.

2. Create Car extending Vehicle with an extra field dailyRate (double). Override calculateRentalCost(): calculate the rental cost by multiplying the daily rate by the number of days. If the rental duration is less than or equal to zero, return 0.

3. Create Bike extending Vehicle with an extra field dailyRate (double). Override calculateRentalCost(): calculate the rental cost by multiplying the daily rate by the number of days. If the rental duration is less than or equal to zero, return 0. Apply a 10% discount if the rental duration is more than 5 days.

4. Create LuxuryCar extending Car with an extra field insuranceFee (double). Reuse the dailyRate field inherited from Car. Override calculateRentalCost(): calculate the rental cost by multiplying the daily rate by the number of days and adding the insurance fee. If the rental duration is less than or equal to zero, return 0.

5. In Main, create a Vehicle\[\] array containing one object of each of the three subclasses. Loop through the array, call calculateRentalCost() and then printRentalDetails() for each vehicle. Include at least one invalid rental duration to demonstrate input validation.

## Requirements

- Use separate Java files for each class.
- Use constructors to initialize the fields.
- Override the abstract method in all three subclasses.
- Do not create objects of the abstract Vehicle class directly.
- Demonstrate runtime polymorphism using the Vehicle\[\] array.
