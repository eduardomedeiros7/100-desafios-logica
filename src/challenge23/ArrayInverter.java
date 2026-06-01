package challenge23;

public class ArrayInverter {
    static void main() {

        int[] numbers = {100, 120, 130, 140, 150};
        int[] invertedNumber = new int[numbers.length];


        int j = 0;

        for (int i = numbers.length -1; i>=0; i--){
            invertedNumber[j] = numbers[i];
            j++;
        }

        System.out.println("Inverted Array:");
        for (int number : invertedNumber){
            System.out.println(number + "");
        }
    }
}





