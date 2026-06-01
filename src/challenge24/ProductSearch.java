package challenge24;


import java.util.Scanner;

public class ProductSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        String[] products = {"Teclado", "Mouse", "Phone", "CPU", "GPU"};

        System.out.println("Enter the name of product: ");
        String nameProduct = sc.nextLine();
        sc.close();

        for (int i = 0; i< products.length; i++){
            if (nameProduct.equalsIgnoreCase(products[i])){
                System.out.println("Product in stock");
                found = true;
                break;

            }
        }


        if (found == false){
            System.out.println("Product not found");
        }







                
            }
            
        }

