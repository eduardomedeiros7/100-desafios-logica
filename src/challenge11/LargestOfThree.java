package challenge11;

import java.util.Scanner;

public class LargestOfThree {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        sc.close();

        if (firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("identical values");
            System.out.println("Largest is: " + firstNumber);
            return;
        }

        int largest = firstNumber;

        if (secondNumber > largest) {
            largest = secondNumber;
        }

        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        System.out.println("Largest is: " + largest);

    }
}
