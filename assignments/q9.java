package bridgelabzclass;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double fee= sc.nextDouble();
        double discount= sc.nextDouble();
        double discountfee= (fee*discount)/100.0;
        System.out.println(fee-discountfee);

    }
}
