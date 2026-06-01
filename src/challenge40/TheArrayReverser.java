package challenge40;

public class TheArrayReverser {
    static void main() {

        int[] numbers = {100, 200, 300, 400, 500, 600, 700, 800, 900};

        System.out.println("Original Array: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int leftIndex = 0;
        int rightRight = numbers.length - 1;

        while (leftIndex < rightRight){
            int temp = numbers[leftIndex];
            numbers[leftIndex] = numbers[rightRight];
            numbers[rightRight] = temp;
            leftIndex++;
            rightRight--;
        }

        System.out.println("---Reversed Array---");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
