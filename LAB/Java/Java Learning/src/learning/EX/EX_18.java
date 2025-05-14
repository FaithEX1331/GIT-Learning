package learning.EX;
import java.util.Scanner;

public class EX_18 {
    public static void main(String[] args) {
//        Q1
//        for (int i = 10; i>0; i--){
//            System.out.printf("10 X %d = %d\n",i,10*i);
//        }

//        Q2
//        int fac = 1;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = n; i>0; i--){
//            fac *= i;
//        }
//        System.out.printf("The factorial of %d is: %d\n",n,fac);

//        Q3
        int sum = 0;
        for (int i = 1; i<11; i++){
            sum += (i*8);
        }
        System.out.println(sum);
    }
}
