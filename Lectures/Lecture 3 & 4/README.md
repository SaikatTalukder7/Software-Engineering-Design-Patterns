# Software Engineering & Design Pattern Lab

## Task 1: Single Responsibility Principle (SRP)

Refactor the given `User` class into separate classes so that each class has only one responsibility.

**Given Code:** A `User` class handles user information, email validation, and database operations in a single class.

**Requirements:**

1. Create a `User` class to store user information such as username and email.
2. Create a separate class to handle email validation.
3. Create another class to handle database operations.
4. Move the email validation logic into the validation class.
5. Move the database-saving logic into the database class.
6. Demonstrate the refactored design in `Main`.

**Goal:** Each class should have only one reason to change and should strictly follow the Single Responsibility Principle.

---

## Task 2: Open-Closed Principle (OCP): Extensible Shipping Cost Calculator

Design a shipping-cost system for an online store that follows the Open-Closed Principle.

Initially, the system supports three shipping types:

- STANDARD: Cost = weight × 10
- EXPRESS: Cost = weight × 25
- OVERNIGHT: Cost = weight × 50

**Requirements:**

1. Identify the OCP violation in the original if/else-based implementation.
2. Create an interface `ShippingStrategy` with a method `calculateCost(double weight)`.
3. Create separate implementing classes for Standard, Express, and Overnight shipping.
4. Create a new `DroneShipping` class with the following calculation:
   - Cost = weight × 70 + 100 taka handling fee.
5. Add the Drone shipping type by creating only one new class.
6. Do not modify any existing class when adding the new shipping type.
7. In `Main`, demonstrate cost calculation for all four shipping types.

**Goal:** The system should be open for extension but closed for modification.

---

## Task 3: Liskov Substitution Principle (LSP): Media Devices

Redesign the given media-device hierarchy to fix an LSP violation.

**Given Problem:** A base class `MediaDevice` has a method `recordVideo()`. A subclass `BasicSpeaker` extends `MediaDevice` but throws an exception when `recordVideo()` is called because a speaker cannot record video.

**Requirements:**

1. Redesign the class hierarchy to avoid the LSP violation.
2. Create a separate interface `VideoRecordable` with a method `recordVideo()`.
3. Create a `SecurityCamera` class that implements `VideoRecordable`.
4. Create a `BasicSpeaker` class that only provides audio-playing functionality through a method such as `playAudio()`.
5. Do not force devices to implement methods they cannot support.
6. In `Main`, demonstrate that iterating over a list of `VideoRecordable` devices never calls a device that cannot record video.

**Goal:** Subclasses should be usable without breaking the expected behavior of their parent types.

---

## Task 4: Interface Segregation Principle (ISP): Office Machine

Redesign the given `OfficeMachine` interface to fix an ISP violation.

**Given Problem:** A single `OfficeMachine` interface contains `print()`, `scan()`, and `fax()` methods. A `SimplePrinter` is forced to implement `scan()` and `fax()` with exception-throwing methods, even though it cannot perform those operations.

**Requirements:**

1. Split the `OfficeMachine` interface into three smaller interfaces:
   - `Printable` with `print()`.
   - `Scannable` with `scan()`.
   - `Faxable` with `fax()`.
2. Create a `SimplePrinter` class that implements only `Printable`.
3. Create an `AllInOnePrinter` class that implements all three interfaces.
4. Implement the required methods in each class.
5. In `Main`, demonstrate the functionality of both printer types.
6. Ensure that `SimplePrinter` is not forced to implement `scan()` or `fax()`.

**Goal:** A class should not be forced to depend on methods it does not use.
