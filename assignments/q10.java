package bridgelabzclass;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int height= sc.nextInt();
        double inches=height/2.54;
        double feet=inches/12;
        System.out.printf(" Your Height in cm is %d while in feet is %f and inches is %f",height,feet,inches);

    }
}
