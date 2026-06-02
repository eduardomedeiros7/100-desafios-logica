package challenge46;

import java.util.Scanner;

public class VowelOrConsonant {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char userChar = sc.next().charAt(0);


        if (!Character.isLetter(userChar)){
            System.out.println("Error: '" + userChar + "' is a number or symbol. Please enter a letter.");
        }


        if (userChar == 'a' || userChar == 'e'  || userChar == 'i' || userChar == 'o' || userChar == 'u'){
            System.out.println("'" + userChar + "' is a vowel.");
        }else{
            System.out.println("'" + userChar + "' is a consonant.");
        }
        sc.close();
    }
}
