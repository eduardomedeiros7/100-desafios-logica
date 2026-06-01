package challenge34;

public class TheLowertValue {
    static void main() {

        int[] numbers = {10, 20, 30, 40, -1, 100};

        int lowestValue = numbers[0];
        int position = 0;


        for (int i = 0; i< numbers.length; i++){
            if (lowestValue >= numbers[i]){
                lowestValue = numbers[i];
                position = i;
            }
        }

        System.out.println("Lowest Value is: " + lowestValue);
        System.out.println("index: " + position);
    }
}
