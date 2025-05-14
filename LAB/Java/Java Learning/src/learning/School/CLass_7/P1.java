package learning.School.CLass_7;
//Parent Class
class Animal2{
    void sound(){
        System.out.println("Animals make sounds.");
    }
}
//Child Class
class Dog2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dog bark");
    }
}
//Another child class
class Cat2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Cats meow.");
    }
}
public class P1 {
    public static void main(String[] args) {
        Animal2 animal2;
        animal2 = new Dog2();
        animal2.sound();
        animal2 = new Cat2();
        animal2.sound();
    }
}
