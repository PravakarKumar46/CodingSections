package Module1.ArraysClass;

public class ProducrArrayPuzzle {
    
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int[] result = solve(A);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int PA[] = new int[n];
        PA[0] = A[0];
        for(int i = 1; i < n; i++){
            PA[i] = PA[i-1] * A[i];
        }

        System.out.println(PA[n-1]);

        int result[] = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = PA[n-1] / A[i];
        }
        return result;
    }
}
