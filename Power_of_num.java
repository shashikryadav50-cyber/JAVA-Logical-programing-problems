import java.util.Scanner;

public class Power_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the power: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * base;
        }

        System.out.println("Answer = " + result);

        sc.close();
    }
    
}
