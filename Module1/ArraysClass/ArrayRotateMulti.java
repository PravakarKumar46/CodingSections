package Module1.ArraysClass;

public class ArrayRotateMulti {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int [] B = {2, 3};
        int n = A.length;
        int m = B.length;
        int rotateArray[][] = new int[m][n];
        int k = 0, l = 0;
        for(int b = 0; b < m; b++){
         int rotateB = B[b];
         for(int i = 0; i < n; i++){
              int a = (rotateB + i) % n;
              rotateArray[k][l++] = A[a];
         }
         k = k+1;
         l = 0;
        }

        for (int i = 0; i < m; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < n; j++) { //this equals to the column in each row.
               System.out.print(rotateArray[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
         }
    }
}
