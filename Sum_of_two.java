import java.util.Scanner;
public class Sum_of_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first ");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("sum:"+sum);
        sc.close();
    }
    
}
