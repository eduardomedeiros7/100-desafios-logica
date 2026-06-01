package challenge41;

import java.util.Scanner;

public class TriangleValidator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();


        boolean isValidTrangle = (sideA + sideB > sideC) && ( sideA + sideC > sideB) && (sideB + sideC > sideA);

        if (isValidTrangle){
            System.out.println("Triangle successfully formed");
        }else{
            System.out.println("Erro: These sides cannot form a triangle. ");

        }
        sc.close();

    }
}