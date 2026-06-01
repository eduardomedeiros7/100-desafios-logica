package challenge25;

public class GradeAverageCalculator {
    static void main() {

        double[] grade = {9.5, 9.8, 6.9, 10.0};

        double average = 0.0;
        double sum = 0.0;

        for (int i = 0; i< grade.length; i++) {
            sum += grade[i];
        }

        average = sum / grade.length;

        System.out.println("Average: " + average);
    }
}
