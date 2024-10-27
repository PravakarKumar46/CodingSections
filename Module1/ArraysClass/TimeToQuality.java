package Module1.ArraysClass;

public class TimeToQuality {
    public static void main(String[] args) {
        int ar[] = {2, 4, 1, 3, 2};
       int result = solve(ar);
       System.out.println(result);
    }
    
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            if(max < A[i]){
             max = A[i];
            }
        }
        System.out.println(max);
 
        for(int i = 0; i < A.length; i++){
            result = result + (max - A[i]);
        }
        return result;
     }
}
