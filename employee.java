import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    static class SalaryCalculator {
        public double calculateBonus(double salary) {
            return salary * 0.1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your monthly salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);
        SalaryCalculator bonusCalculator = new SalaryCalculator();
        double bonus = bonusCalculator.calculateBonus(employee.getSalary());

        System.out.println("\n--- Employee Bonus Report ---");
        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bonus: " + bonus);
    }
}