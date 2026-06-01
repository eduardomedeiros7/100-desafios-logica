package challenge14;

import java.util.Scanner;

public class TimeAdvisor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current time as integers: ");
        int currentTime = sc.nextInt();

        while (currentTime < 0 || currentTime >23){
            System.out.println("Try again");
            System.out.println("Please provide a valid time:");
            currentTime = sc.nextInt();
        }
        sc.close();

        if (currentTime <= 4){
            System.out.println("Good night!");
        }else if (currentTime <= 11){
            System.out.println("Good morning!");
        }else if (currentTime <= 17){
            System.out.println("Good afternoon");
        }else{
            System.out.println("Good evening");
        }

    }
}
