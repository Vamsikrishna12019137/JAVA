import java.util.ArrayList;

import java.util.Scanner;

import java.util.function.Predicate;

class Student {

    String name;

    int rollNo;

    String department;

    Student(String name, int rollNo, String department) {

        this.name = name;

        this.rollNo = rollNo;

        this.department = department;

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 1) {

            System.out.println("Invalid");

            return;

        }

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.next();

            int rollNo = scanner.nextInt();

            String department = scanner.next();

            Student student = new Student(name, rollNo, department);

            students.add(student);

        }

        Predicate<Student> cseStudentPredicate = student -> student.department.equals("CSE");

        for (Student student : students) {

            if (cseStudentPredicate.test(student)) {

                System.out.println(student.rollNo);

            }

        }

    }

}
