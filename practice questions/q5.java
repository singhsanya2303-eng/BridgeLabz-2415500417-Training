package bridgelabs;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x=3.14;
        double r=sc.nextInt();
        double h=sc.nextInt();
        System.out.println("volume of cylinder "+x*r*r*h);
    }
}
