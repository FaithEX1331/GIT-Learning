package learning;

public class PR_17 {
     static int logic(int x, int y){
        if (x>y) return x+y;
        else return x*y;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        c = logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);


        // static method - in main method for direct calling without any instance creation we can only use static method.
        System.out.println(c);
        System.out.println(c1);
    }
}
