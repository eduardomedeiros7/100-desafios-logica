package challenge27;

import java.util.Scanner;

public class EvenAndOddCounter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Quantity Even: " + evenCount);
        System.out.println("Quantity Odd: " + oddCount);


    }
}
