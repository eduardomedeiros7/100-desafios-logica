package challenge37;

import java.util.Scanner;

public class TheMatrixPrinter {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the matrix size: ");
        int matrixSize = sc.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];


        System.out.println("Enter the matrix values: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }


        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");


            }
            System.out.println();
        }


    }
}
