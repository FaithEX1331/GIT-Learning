package learning.EX;
import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Sub 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks of Sub 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks of Sub 3: ");
        int sub3 = sc.nextInt();

        boolean cond = (sub1>=33 && sub2>=33 && sub3>=33);

        int totPer = (sub1+sub2+sub3)/3;

        if (cond && totPer>=40){
            System.out.println("You have passed.");
        }
        else System.out.println("You have failed.");
    }
}
