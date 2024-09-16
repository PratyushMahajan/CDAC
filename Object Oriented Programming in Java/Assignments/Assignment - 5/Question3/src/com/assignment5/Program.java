package com.assignment5;

import java.util.Scanner;

class Employee {

    private static int totalEmployees;
    private static double totalSalaryExpense;

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        
        totalSalaryExpense += salary;
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void applyRaise(Employee[] employees, double percentage) {
        totalSalaryExpense = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                emp.salary += emp.salary * (percentage / 100);
                totalSalaryExpense += emp.salary;
            }
        }
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    public void updateSalary(double newSalary) {
        totalSalaryExpense -= this.salary;
        this.salary = newSalary;
        totalSalaryExpense += newSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];  
        int employeeIndex = 0;  
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Total Employees");
            System.out.println("3. Apply Raise to All Employees");
            System.out.println("4. Total Salary Expense");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    employees[employeeIndex++] = new Employee(id, name, salary);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;
                case 3:
                    System.out.print("Enter Raise Percentage: ");
                    double percentage = sc.nextDouble();
                    Employee.applyRaise(employees, percentage);
                    System.out.println("Raise applied to all employees.");
                    break;
                case 4:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int empId = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    boolean employeeFound = false;
                    for (Employee emp : employees) {
                        if (emp != null && emp.getId() == empId) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated for Employee ID: " + empId);
                            employeeFound = true;
                            break;
                        }
                    }
                    if (!employeeFound) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }
}
