package learning;

public class PR_18 {
    int logic(int x, int y){
        if (x>y) return x+y;
        else return x*y;
    }
    public static void main(String[] args) {
        //Method invocation using object creation.
        PR_18 ln = new PR_18();
        int a = 5;
        int b = 6;
        int c;
        c = ln.logic(a, b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = ln.logic(a1, b1);


        // static method - in main method for direct calling without any instance creation we can only use static method.
        System.out.println(c);
        System.out.println(c1);
    }
}
