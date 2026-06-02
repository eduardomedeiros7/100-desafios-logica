package challenge45;

import java.util.Scanner;

public class IntervalChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int userValue = sc.nextInt();


        if (userValue >=10 && userValue <= 50){
            System.out.println("Value within the range between 10 and 50");
        }else{
            System.out.println("Value outside the range");
        }

        sc.close();
    }
}
