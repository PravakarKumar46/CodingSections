package Module1.ArraysClass;

public class SuffixArray {
    
    public static void main(String[] args) {
        
        int ar[] = {7, 6, -2, 5, 2, 1, 0, 7, 3};
        int n = ar.length;
        int B = 7;
        int SA[] = new int [n];
        SA[n-1] = ar[n-1];
        for (int i = n - 2; i >=0; i--) {
            SA[i] = SA[i+1] + ar[i];
        }

        for (int i : SA) {
            System.out.println(i+" ");
        }
    }
}
