package bridgelabzclass;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();


        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;


        System.out.printf("The distance of %.2f feet is %.2f yards or %.4f miles",
                distanceInFeet, distanceInYards, distanceInMiles);
    }
}
