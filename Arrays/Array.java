package Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3, 4, 5, 0 }, { 9, 4, 3, 8, 6 } };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}