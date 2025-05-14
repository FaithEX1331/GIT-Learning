package learning.EX;

class Square{
    double side;

    public void setSide(double si) {
        side = si;
    }
    public double perimeter(){
        return side*4;
    }
    public double area(){
        return side*side;
    }
}
public class EX_33 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(12.43);
        System.out.println(sq.perimeter());
        System.out.println(sq.area());
    }
}
