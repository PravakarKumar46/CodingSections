package Module1.ArraysClass;

public class MinimumPicks {

    /**
     * Problem Description
       You are given an array of integers A of size N.
       Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
     */
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};
        System.out.println(solve(ar));
    }

    public static int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
     int maxx = Integer.MIN_VALUE, minn = Integer.MAX_VALUE;
      for (int i = 0; i < A.length; i++) {
        if (A[i] % 2 == 0)
          maxx = Math.max(A[i], maxx);
        else
          minn = Math.min(A[i], minn);
      }
  
      return maxx - minn;
    }
    
}
