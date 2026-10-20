
import java.util.Scanner;

public class AverageOfSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum = sum + num;
        }

        double average = sum / 6.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}
