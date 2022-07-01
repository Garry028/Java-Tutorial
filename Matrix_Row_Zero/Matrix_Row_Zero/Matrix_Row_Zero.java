package Matrix_Row_Zero;

import java.io.IOException;

public class Matrix_Row_Zero {
    public static void main(String[] args) throws IOException
    {
        // First declare the arrays
        int A[][]={{2,3,1},{4,1,2},{1,1,0}}; 
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        int C[][]=new int [3][3];

        // Perform the addition
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        // Display the addition
        System.out.println("Addition is: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+ C[i][j]);
            }
            System.out.println();
        }
        
        // make the diagonal as zero
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                {
                    C[i][j]=0;
                }
            }
        }

        System.out.println("Addition after diagonal zero is: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+ C[i][j]);
            }
            System.out.println();
        }
    }
}