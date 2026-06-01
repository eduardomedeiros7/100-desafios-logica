package challenge20;



public class FibonacciSequence {
    static void main() {


        int previous = 0;
        int current = 1;
        int next = 0;

        for (int i = 1; i<=10; i++){
            System.out.println(previous);

            next = previous + current;

            previous = current;

            current = next;


        }

    }
}

