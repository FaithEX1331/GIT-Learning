package learning;

public class PR_21 {
//    static int sum(int ...arr){
//        // int ...arr - this converts all the given arguments into an arr
//        int result = 0;
//        for (int num: arr){
//            result += num;
//        }
//        return result;
//    }
    static int sum(int x, int ...arr){
        // This function needs at least one entry and produces the sum.
        int result = x;
        for (int num: arr){
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Regarding varargs...");
//        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 2 and 3 is: " + sum(2,3));
        System.out.println("The sum of 1, 3 and 4 is: " + sum(1, 3, 4));
    }
}
