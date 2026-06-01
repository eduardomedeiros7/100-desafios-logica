package challenge36;

public class TheArrayReverser {
    static void main() {

        int[] numbers = {100, 200, 300, 400, 500, 600, 700,800, 900, -1000};
        int[] arrayReverser = new int[numbers.length];

        int j = numbers.length -1;
        for (int i = 0; i <numbers.length; i++){
            arrayReverser[j] = numbers[i];
            j--;

        }

        for (int i = 0; i< numbers.length; i++){
            System.out.println(arrayReverser[i]);
        }

    }
}
