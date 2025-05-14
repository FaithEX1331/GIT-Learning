package learning.School.Class_2;
import java.util.Scanner;


public class P_3 {
    public static void main(String[] args) {
        //Scanner instance creation.
        Scanner sc = new Scanner(System.in);

        // Taking the length of the array.
        System.out.print("How many number do you want to sort?");
        int cou = sc.nextInt();

        // Array initialization.
        int [] nums = new int[cou];

        // Filling array using user input
        for(int i = 0; i < cou; i++){
            nums[i] = sc.nextInt();
        }

        // P_3 sorting start
        for(int i = 0; i < cou; i++){
            for (int j = 1; j < cou; i++){
                if(nums[i]>nums[j]){

                }
            }
        }


    }
}
