package learning.EX;

public class EX_27 {
    static int avg(int ...args){
        int sum = 0;
        for (int ele:args){
            sum += ele;
        }
        return sum/ args.length;
    }

    public static void main(String[] args) {
        int avg = avg(23,27,50,0);
        System.out.println(avg);
    }
}
