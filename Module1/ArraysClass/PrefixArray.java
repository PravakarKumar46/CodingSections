package Module1.ArraysClass;

public class PrefixArray {

    public static void main(String[] args) {
        
        int ar[] = {7, 6, -2, 5, 2, 1, 0, 7, 3};
        int n = ar.length;
        int B = 7;
        int PA[] = new int[n];
        PA[0] = ar[0];

        for (int i = 1; i < n ; i++) {
            PA[i] = PA[i-1] + ar[i];
        }

        for (int i : PA) {
            System.out.print(i+" ");
        }

    }
   
}
