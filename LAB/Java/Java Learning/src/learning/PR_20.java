package learning;

public class PR_20 {
    static void foo(){
        System.out.println("Lets fuck!");
    }
    static void foo(int a){
        for (int i = 0; i < a; i++){
            System.out.println("I want to be a gyaru!!");
        }
    }
    public static void main(String[] args) {
        // Method Overloading - when two or more functions have the same name but different work.
        foo();
        foo(5);
    }
}
