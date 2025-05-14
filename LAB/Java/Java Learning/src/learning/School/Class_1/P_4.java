package learning.School.Class_1;
import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int pa = sc.nextInt();
        int pal = pa;
        String pali = "";
        while(pa>0){
            int r = pa%10;
            pali += r;
            pa /= 10;
        }
        String palin = Integer.toString(pal);
        if(pali.equals(palin)) System.out.println("Yes, it is a palindrome.");
        else System.out.println("No, it is not a palindrome.");
    }
}
