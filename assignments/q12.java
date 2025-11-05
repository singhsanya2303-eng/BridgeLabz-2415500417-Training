package bridgelabzclass;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter base (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;


        double areaInCm = areaInInches * 6.4516;


        System.out.printf("The area of the triangle with base %.2f inches and height %.2f inches is:\n", base, height);
        System.out.printf("👉 %.2f square inches\n", areaInInches);
        System.out.printf("👉 %.2f square centimeters\n", areaInCm);
    }
}
