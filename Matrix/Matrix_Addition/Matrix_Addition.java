package Matrix.Matrix_Addition;

import java.util.Scanner;

class Matrix {
    private int A[][] = new int[3][3];
    private int B[][] = new int[3][3];
    private int C[][] = new int[3][3];

    public Matrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = 0;
                B[i][j] = 0;
            }
        }
    }

    public void show() {
        System.out.println("Resultant matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]);
                System.out.print(" ");

            }
            System.out.print("\n");

        }
    }

    public void getMatrix() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matix A: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             A[i][j]=sc.nextInt();
            }

        }

        System.out.println("Enter Matix B: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             B[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }

    public void Addition()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                
            }  
        }
    }

}

public class Matrix_Addition {
    public static void main(String[] args) {
      Matrix m1=new Matrix();
      m1.getMatrix();
      m1.Addition();
      m1.show();
    }
}