package learning.EX;
import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL:");
        String url = sc.nextLine();
        int start = url.indexOf('.');
        System.out.println(url.substring(start));

    }
}
