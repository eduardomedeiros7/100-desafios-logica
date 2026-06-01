package challenge43;

import java.util.Scanner;

public class BmiCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body weight in kg: ");
        double bodyWeight = sc.nextDouble();

        System.out.println("Enter your height in cm:");
        double heightInCm = sc.nextDouble();

        double heightInMeters = heightInCm / 100;

        double heightSquared = heightInMeters * heightInMeters;

        double imc = bodyWeight / heightSquared;


        System.out.println("Your imc is: " + imc);


    }
}
