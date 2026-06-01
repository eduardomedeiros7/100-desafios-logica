package challenge22;

public class ArrayScannerFinder {
    static void main() {
        int bigger = 0;
        int evenNumbers = 0;

        int higherValue = 0;



        int[] numbers = {77, 95, 98, 97, 61, 62, 63, 64};

       higherValue = numbers[0];

       for (int i = 1; i< numbers.length; i++){
           if (higherValue <= numbers[i]){
               higherValue = numbers[i];
           }
       }
       for (int i = 0; i< numbers.length; i++){
           if (numbers[i] % 2 == 0){
               evenNumbers++;
           }
       }
        System.out.println("HigherValue: " + higherValue);
        System.out.println("Evens: " + evenNumbers);



    }
}

