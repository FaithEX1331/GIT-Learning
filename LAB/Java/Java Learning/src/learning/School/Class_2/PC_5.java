package learning.School.Class_2;

public class PC_5 {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println(i);
            if (i==4) break;
            i++;
        }
        int j = 0;
        while (j<10){
            if (j==4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

    }
}
