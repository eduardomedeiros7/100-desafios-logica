package challenge10;

import java.util.Scanner;

public class SimpleCalculator{
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers (doubles):");
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();


        System.out.println("Choose the operation: 1[-] 2[+] 3[*] 4[/]");
        int userChoice = sc.nextInt();

            while (secondNumber == 0.0 && userChoice == 4){
                System.out.println("it's impossibl to divide by 0");
                System.out.println("Tray again");
                secondNumber = sc.nextDouble();
            }


        double result = 0.0;
        boolean validOperation = true;

        if (userChoice == 1){
            result = firstNumber - secondNumber;
        } else if (userChoice == 2) {
            result = firstNumber + secondNumber;
        } else if (userChoice == 3) {
            result = firstNumber * secondNumber;
        } else if (userChoice == 4) {
            result = firstNumber / secondNumber;
        }else{
            System.out.println("Operation invalid");
            validOperation = false;
        }

        if (validOperation){
            System.out.println("Result: " + result);
        }
        sc.close();

    }
}
