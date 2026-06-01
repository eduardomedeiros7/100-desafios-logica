package challenge13;

import java.util.Scanner;

public class GradeEvaluator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double grade = 0.0;


        System.out.println("Enter the grade");
        grade = sc.nextDouble();
        sc.close();

        if (grade >= 9.0){
            System.out.println("Grade A");
        } else if (grade >= 7.0) {
            System.out.println("Grade B");
        }else if (grade >= 5.0){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
