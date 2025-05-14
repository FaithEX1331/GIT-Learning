package learning.EX;

public class EX_21 {
    public static void main(String[] args) {
        int []marks = {89, 90, 99, 98,91, 88};
        int sum = 0;
        int i = 0;
        for(int mark: marks){
            sum += mark;
            i++;
        }
        int avg = sum/i;
        System.out.println("");
    }
}
