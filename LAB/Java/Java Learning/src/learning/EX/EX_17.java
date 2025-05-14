package learning.EX;
import java.util.Scanner;

public class EX_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<11; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
