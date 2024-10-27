package Module1.ArraysClass;

/**
 * Problem Description

A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class BulbSwitch {
    public static void main(String[] args) {
        int A[] = {0,1,0,1};
        System.out.println(bulbsOptimised(A));
        System.out.println(bruitForceApproch(A));
    }
    public static int bruitForceApproch(int[] A){
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count++;
                for (int j = i; j < A.length; j++) {
                    if (A[j] == 0) {
                        A[j] = 1;
                    }else{
                        A[j] = 0;
                    }
                }
            }
        }
        // System.out.println(count);
        return count;
    }
    public static int bulbsOptimised(int[] A) {
        int count = 0;
        int stateOfBulb = 0;
         for (int i = 0; i < A.length; i++) {
             if(stateOfBulb == A[i]){
                 count++;
                 stateOfBulb = 1 - A[i];
             }
     }
         return count;
     }
}
