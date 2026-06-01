package challenge19;

import java.util.Scanner;

public class SummingUp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int limit = sc.nextInt();
        sc.close();

        int sum = 0;

        for (int i = 1; i<= limit; i++){
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

}
