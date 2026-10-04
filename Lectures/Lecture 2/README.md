# Task 1: Company Employee Access System

 ## Problem

 Build a small employee access model for a company, applying **encapsulation** and **inheritance**.

 ### 1\. Employee Class

 Create class `Employee` with private fields:

 - `employeeId` (`int`) — auto-generated using a private static `counter`.
- `name` (`String`)
- `dailyAccessHours` (`int`) — default value `8`.

 #### Constructor

 - Takes only `name`.
- Automatically generates `employeeId`.
- If `name` is blank or empty:
  - Print an error message.
  - Set the name to `"Unknown Employee"`.

 #### Methods

 - Getters for all fields.
- `describe()` — prints employee ID, name, and allowed daily access hours.
- No setter for `employeeId`.

 ### 2\. Manager Class

 Create `Manager extends Employee`.

 Private field:

 - `teamSize` (`int`)

 #### Constructor

 Takes:

 - `name`
- `teamSize`

 #### Override `getDailyAccessHours()`

```
8 + (teamSize ~/ 5)
```

 Example:

```
teamSize = 12
8 + (12 ~/ 5) = 10 hours
```

 #### Override `describe()`

 Also display the manager's team size.

 ### 3\. Intern Class

 Create `Intern extends Employee`.

 Private field:

 - `month` (`int`)

 #### Constructor

 Takes:

 - `name`
- `month`

 #### Override `getDailyAccessHours()`

 - Months `1–3` → `4` hours
- Months `4–6` → `6` hours

 ### 4\. Main

 In `Main`:

 - Create one plain `Employee`.
- Create one `Manager`.
- Create one `Intern`.
- Call `describe()` for each object.
- Print `getDailyAccessHours()` for each object.
- Create another `Employee` with a blank name to demonstrate constructor validation.
