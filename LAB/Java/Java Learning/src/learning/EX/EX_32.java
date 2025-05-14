package learning.EX;

class Employee{
    int Salary;
    String Name;
    public void setName(String name){
        Name = name;
    }
    public void setSalary(int sal){
        Salary = sal;
    }
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
}
public class EX_32 {
    public static void main(String[] args) {
        // Instantiating new object
        Employee Arghya = new Employee();

        // Setting Attributes
        Arghya.setName("Arghya Patra");
        Arghya.setSalary(300000);

        // Getting Attributes
        int salary = Arghya.getSalary();
        String Name = Arghya.getName();

        // Printing the Attributes
        System.out.println("Your Name: "+Name);
        System.out.println("Your Salary: "+salary);

    }
}
