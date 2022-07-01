package Rows_Cols_Addition;

public class Rows_Cols_Addition {
    public static void main(String[] args) {
        int Rows,Cols,Rows_Sum,Cols_Sum;
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        Rows=A.length;
        Cols=A[0].length;

        // Sum of each row
        for(int i=0;i<Rows;i++)
        {
            Rows_Sum=0;
            for (int j = 0; j < Cols; j++) {
                Rows_Sum=Rows_Sum+A[i][j];
            }
            System.out.println("The sum of " + (i+1) + " row: "+ Rows_Sum);
        }

     System.out.println("___________________________________________________\n");

     // sum of each column
        for(int i=0;i<Cols;i++)
        {
            Cols_Sum=0;
            for (int j = 0; j < Rows; j++) {
                Cols_Sum=Cols_Sum+A[j][i];
            }
            System.out.println("The sum of " + (i+1) + " column: "+ Cols_Sum);
        }
       
    }
}
