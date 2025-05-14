package learning.EX;

public class EX_30 {
    static double toFareheit(int c){
        return c*1.8 + 32;
    }
    public static void main(String[] args) {
        double farenheit = toFareheit(45);
        System.out.println(farenheit);
    }
}
