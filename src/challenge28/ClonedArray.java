package challenge28;

import java.util.Scanner;

public class ClonedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] cloned = new int[numbers.length];

        System.out.println("Enter the numbers to fill the array ");

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();


        for (int i = 0; i< numbers.length; i++){
            cloned[i] = numbers[i] * 3;

        }

        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int i = 0; i< cloned.length; i++){
            System.out.println("Cloned: " + cloned[i]);
        }
    }
}
