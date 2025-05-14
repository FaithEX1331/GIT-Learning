package learning.School.Class_2;
import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        System.out.print("How many number do you want to check?");
        int cou = sc.nextInt();
        int [] checks = new int[cou];
        for(int i = 0; i < cou; i++){
            checks[i] = sc.nextInt();
        }
        for (int check:checks){
            if (check%2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.printf("Even number count: %d\n",evenCount);
        System.out.printf("Odd number count: %d\n",oddCount);
    }
}
