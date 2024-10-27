package Module1.ArraysClass;

public class RangeSumQuery {
    public static void main(String[] args) {

        long A[] = {1,2,3,4,5};
        int B[][] = {{1,2,3},{2,3,4},{3,4}};// [5, 7, 9]
        long PA[] = new long[A.length];
        PA[0] = A[0];
        for(int i = 1; i < A.length; i++){
            PA[i] = PA[i-1] + A[i];
        }
        long result[] = new long[B.length];
        
        for(int i = 0; i < B.length; i++){
         
            int l = B[i][0];
            int r = B[i][1];
            // System.out.println(l  + ":"  +r)
            if(l == 0)  {
                result[i] = PA[r];
            }else{
                result[i] = PA[r] - PA[l-1];
            }
        }
        for (long i : result) {
            System.out.print(i + " ");
        }
    }
}
