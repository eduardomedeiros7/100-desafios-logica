package challenge32;

public class ThePassingFilter {
    static void main() {

        double[] grades = {10.0, 5.5, 6.2, 7.5,9.0, 6.2, 7.5,9.0};

        int sumApproved = 0;
        int sumFailed = 0;

        for (int i = 0; i< grades.length; i++){
            if (grades[i] >=7){
                sumApproved++;
            }else{
                sumFailed++;
            }
        }
        System.out.println("Students approved: " + sumApproved);
        System.out.println("Students failed: " + sumFailed);
    }
}
