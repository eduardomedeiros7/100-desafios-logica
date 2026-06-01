package challenge42;

import java.util.Scanner;

public class TimeConverter{
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a quantity in seconds:");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");


        sc.close();
    }

}

