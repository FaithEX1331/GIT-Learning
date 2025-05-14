package learning;

public class PR_16 {
    public static void main(String[] args) {
        int [] [] flats;
        flats  = new int[][]{{101, 102, 103}, {201, 202, 203}, {301, 302, 303}};
        for(int [] floor:flats){
            for (int room: floor){
                System.out.printf("%d ",room);
            }
            System.out.println();
        }
    }
}
