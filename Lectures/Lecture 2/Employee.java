class Employee {

    public static int cnt = 1;

    private int employeeid;
    private String name;
    private int dailyAccessHours;

    public Employee(String name) {
        employeeid = cnt++;

        if (name == null) {
            System.out.println("Error name");
            this.name = "Unknown employee";
        } else {
            this.name = name;
        }
    }
    public int getEmployeeId() {
        return employeeid;
    }
    public String getName() {
        return name;
    }
    public int getDailyAccessHours() {
        return dailyAccessHours;
    }
    public void describe() {
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Name: " + name);
        System.out.println("Daily Access Hour: " + getDailyAccessHours());
    }
}