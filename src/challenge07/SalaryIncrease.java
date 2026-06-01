package challenge07;

import java.util.Scanner;

public class SalaryIncrease {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int increase = 15;

        System.out.println("Enter the salary");
        double salary = sc.nextDouble();

        double newSalary = salary +  (increase * salary) /100.0;

        System.out.println("New salary: " + newSalary);


    }
}
