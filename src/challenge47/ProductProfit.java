package challenge47;

import java.util.Scanner;

public class ProductProfit {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of the product:");
        double valueProduct = sc.nextDouble();

        System.out.println("Cost value: " + valueProduct);

        double profit;
        int rate = 45;

        double salePrice = valueProduct + (rate * valueProduct) / 100;
        profit = salePrice - valueProduct;

        System.out.printf("Sale price: %.2f%n" , salePrice );
        System.out.printf("Profit: %.2f%n", profit);



        sc.close();

    }
}
