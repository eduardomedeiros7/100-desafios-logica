package challenge08;

import java.util.Scanner;

public class OddOrEven {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNumber = sc.nextInt();

        int remainder = userNumber % 2;

        if (remainder == 0){
            System.out.println(userNumber + "is Even");
        }else{
            System.out.println(userNumber + "is Odd");
        }
        sc.close();
    }

}
