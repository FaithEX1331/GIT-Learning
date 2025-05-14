package learning;
import java.util.Scanner;

public class PR_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.print("Do you have a driving license?");
        String dl = sc.next();
        boolean b1 = dl.equalsIgnoreCase("y");
        if(age>=18 || b1) {
            System.out.printf("Yes!%s you are ready to drive.", name);
        }
        else{
            System.out.printf("No!%s you are not ready yet.",name);
        }


    }
}
