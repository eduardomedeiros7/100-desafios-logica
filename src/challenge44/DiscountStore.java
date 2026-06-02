package challenge44;

import java.util.Scanner;

public class DiscountStore {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase amount:");
        double purchaseValue = sc.nextDouble();

        double discount = 10.0;
        double newValue = 0.0;

        if (purchaseValue > 100.0){
            newValue = purchaseValue - (discount * purchaseValue) / 100;
            System.out.printf("Price without discount: %.2f%n ", purchaseValue);
            System.out.printf("With the 10%% discount: %.2f%n ", newValue);
        }else{
            System.out.printf("Gross value: %.2f " , purchaseValue);
        }


    }
}
