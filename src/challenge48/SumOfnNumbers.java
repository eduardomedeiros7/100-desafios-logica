package challenge48;

import java.util.Scanner;

public class SumOfnNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of (N):");
        int n = sc.nextInt();


        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("The sum of all numbers is: " + sum);

        sc.close();
    }
}
