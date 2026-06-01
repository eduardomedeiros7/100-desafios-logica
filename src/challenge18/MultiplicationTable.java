package challenge18;

import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int count = 10;

        System.out.println("Enter one number integer: ");
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= count; i++){
            System.out.println(number +  "x" +  i + ":" + (number * i));
        }

        }
    }

