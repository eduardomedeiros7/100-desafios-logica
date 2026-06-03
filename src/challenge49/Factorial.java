package challenge49;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the value of (N):");
        int N = sc.nextInt();


        int factorial = 1;


        for (int i = 1 ; i <= N; i++){
            factorial *= i;
        }


        System.out.println("Factorial: " + factorial);

        sc.close();


    }
}
