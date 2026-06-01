package challenge32;

import java.util.Scanner;

public class ThePassingFilter2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String name;
        double average = 0.0;
        double sum = 0.0;
        String  result;

        double[] grades = new double[5];

        System.out.println("=== Find out your semester average===");

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your name: ");
            name = sc.nextLine();

            System.out.println("Submit your " + grades.length + "Semester grades: ");

            for (int j = 0; j < grades.length; j++) {
                grades[j] = sc.nextDouble();
                sum += grades[j];
            }
            sc.nextLine();

            average = sum / grades.length;
            sum = 0.0;

            if (average < 7.0) {
                result = "Failed";
            } else {
                result = "Aproved";
            }

            System.out.println(name + " Average: " + average);
            System.out.println("Status: " + result);


        }
        sc.close();
        }

    }

