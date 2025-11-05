package bridgelabs;
import java.util.Scanner;


public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int celsius= sc.nextInt();
        float fahrenheit;
        fahrenheit = (celsius * (float)9/5) + 32;
        System.out.printf("%.2f",fahrenheit);
    }
}
