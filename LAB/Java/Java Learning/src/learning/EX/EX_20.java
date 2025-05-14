package learning.EX;
import java.util.Scanner;


public class EX_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int found = 0;
        int i = 0;
        int [] arr = {12, 34, 45, 42, 76, 87};
        for (int nu: arr){
            if (nu == num){
                found = 1;
                break;
            }
            i++;
        }
        if (found == 1){
            System.out.println("Found at postion: "+i);
        }
        else{
            System.out.println("Not found.");
        }
    }
}
