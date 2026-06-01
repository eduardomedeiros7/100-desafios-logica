package challenge33;


public class TheHighestPeak {
    static void main() {

       int[] numbers = {10, 20, 30, 40, 50};

       int j = numbers[0];
       for (int i = 0; i< numbers.length; i++){
           if (numbers[i] >= j){
               j = numbers[i];
           }
       }

        System.out.println("The greatest value is " + j);
    }
}
