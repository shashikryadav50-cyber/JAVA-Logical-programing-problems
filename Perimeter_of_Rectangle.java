import java.util.Scanner;

public class Perimeter_of_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double perimeter = 2 * (width + height);

        System.out.println("Perimeter of rectangle: " + perimeter);

        sc.close();
    }
    
}
