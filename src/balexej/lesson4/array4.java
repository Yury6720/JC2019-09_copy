package balexej.lesson4;

public class array4 {
    public static void main(String[] args) {
        int[][] array = {{1,1,1,1,1}, {0,1,1,1,0}, {0,0,1,0,0}, {0,1,1,1,0}, {1,1,1,1,1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
           System.out.println();
        }
    }

}
