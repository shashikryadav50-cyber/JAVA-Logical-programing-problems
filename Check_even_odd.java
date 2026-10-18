import java.util.Scanner;
public class Check_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        sc.close();
        
        if(n%2==0){
                System.out.println("even number");
        }else{
            System.out.println(n+"odd number hai");
        }
    }
    
}
