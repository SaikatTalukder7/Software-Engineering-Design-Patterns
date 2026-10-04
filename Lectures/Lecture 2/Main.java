public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Saikat");
        Manager manager = new Manager("Manager Saikat", 10);
        Intern intern = new Intern("Intern Saikat", 5);

        
        System.out.println("Employee");
        employee.describe();
        System.out.println();

        
        System.out.println("Manager");
        manager.describe();
        System.out.println();

        
        System.out.println("Intern");
        intern.describe();
        System.out.println();

        
        System.out.println("Employee Blank");
        Employee employee2 = new Employee("");
        employee2.describe();
    }
}
