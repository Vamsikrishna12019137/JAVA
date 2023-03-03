import java.util.Scanner;

class Employee {
    int id, age;

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
            return;
        }

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            int id = input.nextInt();
            int age = input.nextInt();

            if (id < 10 || id > 1000 || age < 18 || age > 50) {
                System.out.println("Invalid data");
                return;
            }

            employees[i] = new Employee(id, age);
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (employees[i].age < 30) {
                System.out.println(employees[i].id + " " + employees[i].age);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Employee found with age less than 30");
        }
    }
}
