package challenge30;

public class TheTargetSearcher {
    static void main() {

        int[] numbers = {100, 200, 300, 400, 500, 600,700, 800};
        int target = 700;
        boolean found = false;


        for (int i = 0; i< numbers.length; i++){
            if (target == numbers[i]){
                found = true;
                System.out.println("Target found at index: " + i);
                break;
            }
        }
        if (found == false){
            System.out.println("Target not found");
        }
    }
}
