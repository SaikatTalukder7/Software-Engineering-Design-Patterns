# Task 1: Company Employee Access System

## Problem Statement

Build a small **Employee Access System** for a company using **encapsulation** and **inheritance**.

### 1. Create the `Employee` Class

Create a class named `Employee` with the following **private fields**:

- `employeeId` (`int`)
  - Automatically generated using a private static `int` counter.
  - The counter must increment whenever a new `Employee` is created.
  - Do not provide a setter for `employeeId`.

- `name` (`String`)

- `dailyAccessHours` (`int`)
  - Default value should be `8`.

#### Constructor

Create a constructor that takes only the employee's `name`.

The `employeeId` must be generated automatically.

If the provided name is blank or empty:

- Print an error message.
- Set the employee's name to `"Unknown Employee"`.

#### Methods

Provide getters for:

- `employeeId`
- `name`
- `dailyAccessHours`

Add a method called `describe()` that prints:

- Employee ID
- Employee name
- Allowed daily access hours

---

### 2. Create the `Manager` Class

Create a subclass named `Manager` that extends `Employee`.

Add the following private field:

- `teamSize` (`int`)

#### Constructor

The `Manager` constructor should take:

- `name`
- `teamSize`

#### Daily Access Hours

Override `getDailyAccessHours()` so that a manager receives:

```text
8 + (teamSize ~/ 5)
````

 hours per day.

 For example:

```
teamSize = 12

8 + (12 ~/ 5)
= 8 + 2
= 10 hours
```

 #### Describe Method

 Override `describe()` so that it also displays the manager's:

 - Team size

---

 ### 3\. Create the `Intern` Class

 Create a subclass named `Intern` that extends `Employee`.

 Add the following private field:

 - `month` (`int`)

 #### Constructor

 The `Intern` constructor should take:

 - `name`
- `month`

 #### Daily Access Hours

 Override `getDailyAccessHours()` according to the following rules:

 | Month | Daily Access Hours |
| --- | --- |
| 1–3 | 4 hours |
| 4–6 | 6 hours |

---

 ### 4\. Main Program

 In `Main`:

 1. Create one plain `Employee`.
2. Create one `Manager`.
3. Create one `Intern`.
4. Call `describe()` for each object.
5. Print `getDailyAccessHours()` for each object.
6. Create another `Employee` with a blank name to demonstrate constructor validation.

---

 ## Expected Concepts

 Your solution should demonstrate:

 - Encapsulation
- Private fields
- Getters
- Constructors
- Static variables
- Automatic ID generation
- Inheritance
- Method overriding
- Constructor validation
- Integer division using `~/`

```

This is the **question only**, ready to put into `README.md`.
```
