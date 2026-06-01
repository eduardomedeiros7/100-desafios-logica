package challenge06;

import java.util.Scanner;

public class DaysToWeeksAndDays{
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;

        System.out.println(totalDays + " days is equal to " + weeks + " week(s) and " + remainingDays + "day");
        sc.close();
    }
}
