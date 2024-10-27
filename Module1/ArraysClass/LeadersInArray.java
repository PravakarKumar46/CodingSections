package Module1.ArraysClass;

public class LeadersInArray {
    public static void main(String[] args) {
        int A[] = {16,17,4,3,5,2};

        int ar[] = solve(A);
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }
        public static int[] solve(int[] A) {
            int n = A.length;
            int count = 1;
            int max = A[n-1];
            for (int i = n-2; i >= 0; i--) {
                if (max < A[i]) {
                    max = A[i];
                    count++;
                }
            }
            // System.out.println(count);
            max = A[n-1];
            int result[] = new int[count];
            result[count-1] = max;
            int j = count - 2;
             for (int i = n-2; i >= 0; i--) {
                if (count > 0 && max < A[i]) {
                    max = A[i];
                    // System.out.print(j+" ");
                    result[j] = max;
                    j--;
                }
            
            }
    
            return result;
        }
}
