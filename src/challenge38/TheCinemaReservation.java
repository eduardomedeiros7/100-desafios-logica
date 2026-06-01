package challenge38;

import java.util.Scanner;

public class TheCinemaReservation {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] seatGrid = new int[5][5];

        System.out.println("---WELCOME TO THE CINEMA---");

        while (true){
            System.out.println("---Current Screen Map---");

            for (int i = 0; i < seatGrid.length; i++){
                for (int j = 0; j < seatGrid.length; j++){

                    if (seatGrid[i][j] == 0){
                        System.out.println("[]");
                    }else{
                        System.out.println("[X]");
                    }
                }
                System.out.println();
            }

            System.out.println("Enter the row (1 to 5) or 0 to exit:");
            int userRow = sc.nextInt();

            if (userRow == 0){
                System.out.println("Closing system...");
                break;
            }

            System.out.println("Enter the column (1 to 5):");
            int userCol = sc.nextInt();

            int matrixRow = userRow -1;
            int matrixCol = userCol -1;


            if (seatGrid[matrixRow][matrixCol] == 1){
                System.out.println("ERROR: Seat already taken! Choose another one:");
            }else{
                seatGrid[matrixRow][matrixCol] =1;
                System.out.println("SUCCESS: Ticket reserved!");
            }
        }
        sc.close();
    }

}
