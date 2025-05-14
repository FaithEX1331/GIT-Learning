package learning;

public class PR_15 {
    public static void main(String[] args) {
        //array definition and initialization
        // int [] marks = new int[5];
        // marks[0] = 12;
        // marks[1] = 22;
        // marks[2] = 32;
        // marks[3] = 42;
        // marks[4] = 52;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        int [] marks = {12,22,32,42,52};
        System.out.println("In reverse");
        for (int i = marks.length; i>0; i--){
            System.out.println(marks[i-1]);
        }
        System.out.println("In normal");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Using advanced for loop");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
