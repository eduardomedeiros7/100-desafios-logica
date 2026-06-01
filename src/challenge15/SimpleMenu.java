package challenge15;

import java.util.Scanner;

public class SimpleMenu {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---MENU---");
        System.out.println("[1]Burger [2]Pizza [3]Combo");
        int userChoice = sc.nextInt();

        while (userChoice < 1 || userChoice > 3){
            System.out.println("Invalid Option");
            System.out.println("Please choose a valid option from our menu!!!");
            userChoice = sc.nextInt();
        }
        sc.close();

        if (userChoice == 1){
            System.out.println("Burger R$10.99");
        }else if (userChoice == 2){
            System.out.println("Pizza R$ 20.00");
        }else{
            System.out.println("Combo 27.99");
        }
    }
}
