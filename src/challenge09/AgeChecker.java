package challenge09;

import java.util.Scanner;

public class AgeChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();


        if (age <= 0) {
            System.out.println("Invalid age! Age must be greater than 0.");
        }

        else if (age < 18) {
            System.out.println("He's not old enough to serve yet!");
        }

        else {
            System.out.println("Is fit for military service.");
        }

        sc.close();
    }
}