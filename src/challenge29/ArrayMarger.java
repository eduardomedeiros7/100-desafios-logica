package challenge29;

public class ArrayMarger {
    static void main() {

        int[] arrayOne = {100, 200, 300};
        int[] arrayTwo = {400, 500, 600};

        int[] margedArray = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++){
            margedArray[i] = arrayOne[i];
        }

        for (int i = 0; i< arrayTwo.length; i++){
            margedArray[i + arrayOne.length] = arrayTwo[i];
        }

        System.out.println("Marged Array: ");
        for (int i = 0; i< margedArray.length; i++){
            System.out.println(margedArray[i]);
        }
    }




}
