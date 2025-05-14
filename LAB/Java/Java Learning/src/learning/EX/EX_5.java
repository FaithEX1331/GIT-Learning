package learning.EX;
import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometer:");
        double km = sc.nextDouble();
        double mile = km*0.621371d;
        System.out.println("Miles: "+mile);
    }
}
