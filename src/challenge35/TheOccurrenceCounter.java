package challenge35;

public class TheOccurrenceCounter {
    static void main() {


        int[] numbers = {100, 200, 300, 99, 99, -100, 200};

        int sum = 0;
        int numberTarget = 99;


        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] == numberTarget){
                sum++;
            }

        }

        System.out.println("The target number was found " + sum + " times");
    }
}
