package challenge26;

public class MinAndMaxFinder {
    static void main() {

        int[] numbers = {-300, 100,99,101, -200, 102,103};

        int bigger = numbers[0];
        int minor = numbers[0];

        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] >= bigger){
                bigger = numbers[i];
            }
        }
        for (int i = 0; i< numbers.length; i++){
            if (minor >= numbers[i]){
                minor = numbers[i];
            }


        }

        System.out.println(bigger);
        System.out.println(minor);


    }
}
