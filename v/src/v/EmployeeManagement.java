package v;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String designation;
    double salary = 30000;
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {

                while (true) {
                    while (true) {
                        System.out.print("Enter your name: ");
                        e.name = sc.nextLine();

                        int spaces = 0;

                        for (int i = 0; i < e.name.length(); i++) {
                            if (e.name.charAt(i) == ' ')
                                spaces++;
                        }

                        if (e.name.isEmpty()) {
                            System.out.println("Name cannot be empty!");
                        }
                        else if (spaces > 2) {
                            System.out.println(
                                "Name can contain maximum 2 spaces!"
                            );
                        }
                        else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.print("Enter your age: ");
                        e.age = sc.nextInt();
                        sc.nextLine();

                        if (e.age >= 16 && e.age <= 66) {
                            break;
                        }

                        System.out.println("Age must be between 16 and 66!");
                    }
                    while (true) {
                        System.out.println("\nSelect your designation:");
                        System.out.println("1. Programmer");
                        System.out.println("2. Manager");
                        System.out.println("3. Tester");
                        System.out.print("Enter choice: ");

                        int d = sc.nextInt();
                        sc.nextLine();

                        if (d == 1) {
                            e.designation = "Programmer";
                            break;
                        }
                        else if (d == 2) {
                            e.designation = "Manager";
                            break;
                        }
                        else if (d == 3) {
                            e.designation = "Tester";
                            break;
                        }
                        else {
                            System.out.println(
                                "Invalid designation! Try again."
                            );
                        }
                    }
                    System.out.println("\n--- Employee Details ---");
                    System.out.println("Name: " + e.name);
                    System.out.println("Age: " + e.age);
                    System.out.println( "Designation: " + e.designation);

                    System.out.print("Do you want to edit? (yes/no): " );
                    String ans = sc.nextLine();
                    if (ans.equalsIgnoreCase("no")) {
                        System.out.println( "Employee saved successfully!");
                        break;
                    }
                    if (!ans.equalsIgnoreCase("yes")) {
                        System.out.println("Please enter only yes or no.");
                    }
                }
            }
            else if (choice == 2) {

                System.out.println("\n--- Employee Details ---");

                if (e.name == null) {
                    System.out.println(  "No employee records available.");
                }
                else {
                    System.out.println("Name: " + e.name);
                    System.out.println("Age: " + e.age);
                    System.out.println(   "Designation: " + e.designation);
                    System.out.println("Salary: ₹" + e.salary);
                }
            }
            else if (choice == 3) {

                if (e.name == null) {
                    System.out.println(
                        "No employee records available."
                    );
                }
                else {
                    System.out.println(
                        "Employee: " + e.name
                    );
                    System.out.println(
                        "Current Salary: ₹" + e.salary
                    );

                    System.out.print(
                        "Enter salary raise amount: ₹"
                    );

                    double raise = sc.nextDouble();
                    sc.nextLine();

                    e.salary = e.salary + raise;

                    System.out.println(
                        "Salary updated successfully!"
                    );
                    System.out.println(
                        "New Salary: ₹" + e.salary
                    );
                }
            }
            else if (choice == 4) {
                System.out.println(
                    "Thank you for using Employee Management System!"
                );
            }

            else {
                System.out.println(
                    "Invalid choice! Please try again."
                );
            }

        } while (choice != 4);

        sc.close();
    }
}

