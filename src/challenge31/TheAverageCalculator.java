package challenge31;

public class TheAverageCalculator {
    static void main() {

        double[] grade = {10.0, 7.5, 8.5, 9.5, 10.0};
        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < grade.length; i++){
            sum += grade[i];
        }
        average = sum/ grade.length;
        System.out.println("Average: " + average);

    }
}
