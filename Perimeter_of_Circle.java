import java.util.Scanner;

public class Perimeter_of_Circle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double pi = 3.14;
        double perimeter = 2 * pi * radius;

        System.out.println("Perimeter of Circle is: " + perimeter);

        sc.close();
    }
}

    
