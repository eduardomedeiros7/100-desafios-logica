package challenge50;

import java.util.Scanner;

public class PrimeNumber{
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a value: ");
        int n = sc.nextInt();

        boolean isPrime = true;


        if (n <=1){
            isPrime = false;
        }else{
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }

            }
        }
        if (isPrime){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is Not a prime number");
        }

        sc.close();
    }
}
