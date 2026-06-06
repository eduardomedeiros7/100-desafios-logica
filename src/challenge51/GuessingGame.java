package challenge51;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberSystem = random.nextInt(101);
        int counter = 0;


        System.out.println("Guess the system number (between 1 and 100):");
        int n = sc.nextInt();
        counter++;

        while (n != numberSystem) {

            if (n > numberSystem) {
                System.out.println("Wrong! The secret number is lower");
            } else {
                System.out.println("Wrong! The secret number is HIGHER");
            }

            System.out.println("Try again");
            n = sc.nextInt();
            counter++;
        }

        if (counter == 10) {
            System.out.println("Do you want to give up? [1]YES [2]NO");
            int userChoose = sc.nextInt();
            if (userChoose == 1) {
                System.out.println("GAME OVER!!!" + counter + " failed attempts. The number was " + numberSystem);
                return;
            }
        }
        System.out.println("Congratulations! You got it right after " + counter + " tries");


        sc.close();
    }

}

