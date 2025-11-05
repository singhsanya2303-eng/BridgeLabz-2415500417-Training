package bridgelabzclass;

public class q7 {
    public static void main(String[] args) {
        double radiusearth= 6378;
        double volumeinkm= 4/3.0* Math.PI* Math.pow(radiusearth,3);
        double miles=6378*0.621371;
        double volumeinmiles= 4/3.0* Math.PI* Math.pow(miles,3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volumeinkm,volumeinmiles);

    }
}
