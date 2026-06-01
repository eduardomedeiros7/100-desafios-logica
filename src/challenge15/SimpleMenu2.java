package challenge15;

import java.util.Scanner;

public class SimpleMenu2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Menu===");
        System.out.println("[1]Burger [2]Pizza [3]Combo ");
        int userChoice = sc.nextInt();


        while (userChoice <= 0 || userChoice > 3){
            System.out.println("Invalid Option");
            System.out.println("Please choose a valid option from our menu!!!");
            userChoice = sc.nextInt();
        }
        sc.close();

        switch (userChoice){

            case 1:
                System.out.println("Buger R$ 10.99");
                break;
            case 2:
                System.out.println("Pizza R$ 20.00");
                break;
            case 3:
                System.out.println("Combo R$ 27.90");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
