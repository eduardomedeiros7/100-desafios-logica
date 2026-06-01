package challenge12;

import java.util.Scanner;

public class LeapYear {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int yearOfBirth = sc.nextInt();
        sc.close();

        boolean isLeapYear = false;

        if (yearOfBirth % 400 == 0){
            isLeapYear = true;
        }
        else if (yearOfBirth % 100 == 0){
            isLeapYear = false;
        }
        else if (yearOfBirth % 4 == 0){
            isLeapYear = true;
        }

        if (isLeapYear){
            System.out.println(yearOfBirth + "is a leap year!");
        }else{
            System.out.println(yearOfBirth + "is NOT a leap year");
        }

    }
}
