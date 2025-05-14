package learning;
import java.util.Scanner;

class Employee{
    Scanner sc = new Scanner(System.in);

    private int id;
    private String Name;
    private int Salary;

    public Employee(){
        //Constructor
        System.out.print("Your ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Your Name: ");
        Name = sc.nextLine();

        System.out.print("Your Salary: ");
        Salary = sc.nextInt();
    }
    public Employee(int ID, String name, int salary){
        id = ID;
        Name = name;
        Salary = salary;
    }

    public void setId(int i){
        id = i;
    }
    public void setName(String name){
        Name = name;
    }
    public void setSalary(int sal){
        Salary = sal;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }

    public void printDetails(){
        // Printing attributes.
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee Salary: "+Salary);
    }
}
public class PR_23 {
    public static void main(String[] args) {
        System.out.println("This is a custom class.");
        Employee Arghya = new Employee(123, "Arghya Patra", 2400000);// New Employee Object Instantiation.

        Employee Bipu = new Employee();
        // Setting attributes/properties
        // Arghya.setId(123);
        // Arghya.setName("Arghya Patra");
        // Arghya.setSalary(2400000);

        Arghya.printDetails();
        Bipu.printDetails();

    }
}
