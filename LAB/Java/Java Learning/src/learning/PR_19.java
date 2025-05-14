package learning;

public class PR_19 {
    static int change(int [] arr){
        return arr[0]=98;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int [] arr = {a,b};
        int c = change(arr);
        System.out.println(c);
        int [] marks = {76,89,87,98,99};
        System.out.println(marks[0]);
        change(marks);
        System.out.println(marks[0]);
        // marks is the reference to the address of the actual array. It contains the address.
        // so when the 'marks' is passed into the method the address is being passed.
        // so using the address to create an array, points to the already created array.
        // so when a change is made in the function it is actually reflected into the storage location.
    }
}
